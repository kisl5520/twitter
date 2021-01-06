package com.kisl.twitter.mbg.mapper;

import com.kisl.twitter.mbg.model.TXtyhxx;
import com.kisl.twitter.mbg.model.TXtyhxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TXtyhxxMapper {
    long countByExample(TXtyhxxExample example);

    int deleteByExample(TXtyhxxExample example);

    int deleteByPrimaryKey(String gid);

    int insert(TXtyhxx record);

    int insertSelective(TXtyhxx record);

    List<TXtyhxx> selectByExample(TXtyhxxExample example);

    TXtyhxx selectByPrimaryKey(String gid);

    int updateByExampleSelective(@Param("record") TXtyhxx record, @Param("example") TXtyhxxExample example);

    int updateByExample(@Param("record") TXtyhxx record, @Param("example") TXtyhxxExample example);

    int updateByPrimaryKeySelective(TXtyhxx record);

    int updateByPrimaryKey(TXtyhxx record);
}