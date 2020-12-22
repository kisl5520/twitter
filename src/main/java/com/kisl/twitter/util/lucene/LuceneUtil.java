package com.kisl.twitter.util.lucene;/**
 * Created by Administrator on 2020/3/10.
 */

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/3/10 20:35
 * @Version 1.0.0
 */
public class LuceneUtil {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(LuceneUtil.class);

    /**
     * 获取文件路径.
     *
     * @param tmp
     *            文件相对路径
     * @return 文件绝对路径
     */
    public static String getAbsolutePath(final String tmp) {
        final File fileTmp = new File(tmp + File.separator);
        if (!fileTmp.exists()) {
            if (!fileTmp.isDirectory()) {
                fileTmp.mkdir();
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("lucene索引 AbsolutePath：" + fileTmp.getAbsolutePath());
        }
        return fileTmp.getAbsolutePath();
    }

    /**
     * 判断是否创建indexDirectory.
     *
     * @param indexDirectory
     *            路径
     * @return true,false
     */
    public static boolean getFSDirectoryIs(final String indexDirectory) {
        final File file = new File(indexDirectory + File.separator + "segments");
        return !file.isFile();
    }

    /**
     * 创建lucene索引.
     *
     * @param indexDirectory
     *            保存Lucene索引文件的路径
     * @param luceneBean
     *            业务数据 和流
     * @return 是否创建成功
     */
    public static synchronized boolean createLuceneIndex(final String indexDirectory, final LuceneBean luceneBean) {
        if (luceneBean == null) {
            return false;
        }
        if (logger.isInfoEnabled()) {
            logger.info("创建lucene索引开始。位置：" + indexDirectory);
        }
        Directory directory = null;
        IndexWriter writer = null;
        try {
            // 创建Directory对象 ，也就是分词器对象
            final boolean flg = getFSDirectoryIs(indexDirectory);
            directory = FSDirectory.getDirectory(new File(indexDirectory), flg);
            // 创建一个简单的分词器,可以对数据进行分词
            final Analyzer analyzer = new StandardAnalyzer();
            // 创建索引实例
            // 第1个参数是Directory,
            // 第2个是分词器,
            // 第3个表示是否是创建, true代表覆盖原先数据, 如果为false为在此基础上面修改,
            // 第4个MaxFieldLength表示对每个Field限制建立分词索引的最大数目，
            // 如果是MaxFieldLength.UNLIMITED，表示长度没有限制;
            // 如果是MaxFieldLength.LIMITED则表示有限制，可以通过IndexWriter对象的setMaxFieldLength（int
            // n）进行指定
            writer = new IndexWriter(directory, analyzer, flg);
            final Document doc = new Document();
            final String contents = luceneBean.getContents();
            final String ywid = luceneBean.getId();
            if (logger.isInfoEnabled()) {
                logger.info("创建lucene索引开始。ywid：【" + ywid + "】contents：【" + contents + "】");
            }
            // 创建Field对象，并放入doc对象中
            doc.add(new Field("contents", contents, Field.Store.YES, Field.Index.TOKENIZED));
            // 创建文件名的域，并放入doc对象中
            doc.add(new Field("id", ywid, Field.Store.YES, Field.Index.UN_TOKENIZED));
            final Date date = new Date();
            doc.add(new Field("date", String.valueOf(date.getTime()), Field.Store.YES, Field.Index.UN_TOKENIZED));
            // 写入IndexWriter
            writer.addDocument(doc);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeLucene(directory, writer, null, null);
        }
        if (logger.isInfoEnabled()) {
            logger.info("创建lucene索引结束。");
        }
        return true;
    }

    /**
     * 创建lucene索引.
     *
     * @param indexDirectory
     *            保存Lucene索引文件的路径
     * @param list
     *            业务数据 和流
     * @return 是否创建成功
     */
    public static synchronized boolean createLuceneIndexs(final String indexDirectory, final List<LuceneBean> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (logger.isInfoEnabled()) {
            logger.info("创建lucene索引开始。位置：" + indexDirectory);
        }
        for (int i = 0; i < list.size(); i++) {
            final boolean flg = createLuceneIndex(indexDirectory, list.get(i));
            if (!flg) {
                return false;
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("创建lucene索引结束。");
        }
        return true;
    }

    /**
     * 关闭流.
     *
     * @param directory
     *            Directory
     * @param writer
     *            IndexWriter
     * @param reader
     *            IndexReader
     * @param search
     *            IndexSearcher
     */
    public static void closeLucene(final Directory directory, final IndexWriter writer, final IndexReader reader,
                                   final IndexSearcher search) {
        try {
            // 关闭索引
            if (search != null) {
                search.close();
            }
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            if (directory != null) {
                directory.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询lucene数据.
     *
     * @param indexDirectory
     *            保存Lucene索引文件的路径
     * @param searchText
     *            查找文本
     * @return ids 关系ids
     */
    public static List<String> searchLucene(final String indexDirectory, final String searchText) {
        final List<String> lists = new ArrayList<String>();
        // 保存索引文件的地方
        if (logger.isInfoEnabled()) {
            logger.info("查询lucene数据开始。关键词：【" + searchText + "】位置：" + indexDirectory);
        }
        final boolean flg = getFSDirectoryIs(indexDirectory);
        if (flg) {
            return lists;
        }
        Directory directory = null;
        IndexSearcher search = null;
        try {
            // 保存索引文件的地方
            // 创建Directory对象 ，也就是分词器对象
            directory = FSDirectory.getDirectory(new File(indexDirectory), false);
            // 创建 IndexSearcher对象，相比IndexWriter对象，这个参数就要提供一个索引的目录就行了
            search = new IndexSearcher(directory);
            // 创建QueryParser对象,
            // 第1个参数表示Lucene的版本,
            // 第2个表示搜索Field的字段,
            // 第3个表示搜索使用分词器
            final QueryParser parser = new QueryParser("contents", new StandardAnalyzer());
            parser.setDefaultOperator(QueryParser.OR_OPERATOR);
            // 生成Query对象
            final String str = searchTextHandle(searchText);
            final Query query = parser.parse(str);
            // 搜索结果 TopDocs里面有scoreDocs[]数组，里面保存着索引值
            //final Sort sortField = new Sort("date", true);
            //final TopFieldDocs hits = search.search(query, null, 100, sortField);
            final TopDocs hits = search.search(query, null, 100);
            // hits.totalHits表示一共搜到多少个
            // System.out.println("找到了" + hits.totalHits + "个");
            // 循环hits.scoreDocs数据，并使用indexSearch.doc方法把Document还原，再拿出对应的字段的值
            for (int i = 0; i < hits.scoreDocs.length; i++) {
                final ScoreDoc sdoc = hits.scoreDocs[i];
                final Document doc = search.doc(sdoc.doc);
                lists.add(doc.get("id"));
            }
            if (logger.isInfoEnabled()) {
                logger.info("查询lucene数据结束。关键词：【" + str + "】lists：" + lists);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeLucene(directory, null, null, search);
        }
        return lists;
    }

    /**
     * 查询条件特殊字符处理.
     *
     * @param searchText
     *            检索字符
     * @return str
     */
    public static String searchTextHandle(final String searchText) {
        return searchText.replaceAll("^\\*+", "");
    }

    /**
     * 删除索引.
     *
     * @param indexDirectory
     *            路径
     * @param ywid
     *            ywid
     */
    public static synchronized void deleteDocuments(final String indexDirectory, final String ywid) {
        if (logger.isInfoEnabled()) {
            logger.info("删除lucene deleteDocuments开始。位置：" + indexDirectory + ",ywid：" + ywid);
        }
        final boolean flg = getFSDirectoryIs(indexDirectory);
        if (flg) {
            return;
        }
        Directory directory = null;
        IndexReader reader = null;
        try {
            directory = FSDirectory.getDirectory(new File(indexDirectory), false);
            // final Analyzer analyzer = new StandardAnalyzer();
            // final IndexModifier indexModifier = new IndexModifier(directory,
            // analyzer, false);
            // indexModifier.deleteDocument(1);
            // indexModifier.close();
            // final IndexWriter indexWriter = new IndexWriter(directory,
            // analyzer, false);
            // indexWriter.deleteDocuments(new Term("id",ywid));
            // indexWriter.close();
            reader = IndexReader.open(directory);
            final Term term = new Term("id", ywid);
            // TermDocs docs = indexReader.termDocs(term);
            // while (docs.next()) {
            // System.err.println("含有所查找的" + term + "的Document的编号为" +
            // docs.doc());
            // System.err.println("Term在文档中的出现次数:" + docs.freq());
            // }
            final int idx = reader.deleteDocuments(term);
            if (logger.isInfoEnabled()) {
                logger.info("删除lucene deleteDocuments:【" + ywid + "】成功。idx：" + idx);
            }
            // 清空回收站
            // writer.forceMergeDeletes();
            // 清空索引(包括回收站)
            // writer.deleteAll();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeLucene(directory, null, reader, null);
        }
        if (logger.isInfoEnabled()) {
            logger.info("删除lucene deleteDocuments结束。");
        }
    }

    /**
     * 获取常见字符编码.
     *
     * @param str
     *            字符
     * @return 编码
     */
    public static String getEncoding(final String str) {
        String encode = "GB2312";
        try {
            // 判断是不是GB2312
            if (str.equals(new String(str.getBytes(encode), encode))) {
                return encode;
            }
            encode = "ISO-8859-1";
            // 判断是不是ISO-8859-1
            if (str.equals(new String(str.getBytes(encode), encode))) {
                return encode;
            }
            encode = "UTF-8";
            // 判断是不是UTF-8
            if (str.equals(new String(str.getBytes(encode), encode))) {
                return encode;
            }
            encode = "GBK";
            // 判断是不是GBK
            if (str.equals(new String(str.getBytes(encode), encode))) {
                return encode;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ""; // 如果都不是，说明输入的内容不属于常见的编码格式。
    }

    /**
     * 测试入口.
     *
     * @param args
     *            无
     */
    public static void main(final String[] args) {
        try {
            // 检索文件存储路径
            final String indexDirectory = "F:\\mywork\\KISL\\JetBrains\\twitter\\knowledge";
            LuceneUtil.getAbsolutePath(indexDirectory);
            final List<LuceneBean> luceneList = new ArrayList<LuceneBean>();
            for (int i = 1; i < 6; i++) {
                final String ywid = "ywid_" + i;
                final String contents = "啊中国人民共和国,开发测试lucene".substring(i);
                final LuceneBean luceneBean = new LuceneBean();
                luceneBean.setId(ywid);
                luceneBean.setContents(contents);
                luceneList.add(luceneBean);
                LuceneUtil.deleteDocuments(indexDirectory, ywid);
                LuceneUtil.createLuceneIndex(indexDirectory, luceneBean);
            }
            final String searchText = "中国 测试";
            LuceneUtil.searchLucene(indexDirectory, searchText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
