package com.kisl.util.lucene;/**
 * Created by Administrator on 2020/3/9.
 */

import java.util.Map;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2020/3/9 19:55
 * @Version 1.0.0
 */
public class LuceneBean {
    /**
     * id .
     */
    private String id;
    /**
     * contents .
     */
    private String contents;
    /**
     * map .
     */
    private Map<String, Object> map;

    /**
     * 获取id.
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * 设置{property}.
     * @param newId .
     */
    public void setId(final String newId) {
        id = newId;
    }

    /**
     * 获取contents.
     * @return String
     */
    public String getContents() {
        return contents;
    }

    /**
     * 设置{property}.
     * @param newContents .
     */
    public void setContents(final String newContents) {
        contents = newContents;
    }

    /**
     * 获取FileId.
     * @return String
     */
    public Map<String, Object> getMap() {
        return map;
    }

    /**
     * 设置{property}.
     * @param newMap .
     */
    public void setMap(final Map<String, Object> newMap) {
        map = newMap;
    }

}
