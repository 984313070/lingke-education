package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.Zbke;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ZbkeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zbke record);

    int insertSelective(Zbke record);

    Zbke selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zbke record);

    int updateByPrimaryKey(Zbke record);

    List<Zbke> findzbyishenAll(@Param ("zbke") Zbke zbke,@Param ("start") int start, @Param ("rows") Integer rows);

    int findcountzbyishenAll(@Param ("zbke") Zbke zbke);

    void updzbfenxiaostatus(Integer id, Integer zbfenxiaostatus);

    void zbjinyong(Integer id, Integer jinyongstatus);

    int findcountzbhuishouzhanAll(@Param ("zbke") Zbke zbke);

    List<Map> findzbhuishouzhanAll(@Param ("zbke") Zbke zbke,@Param ("start") int start, @Param ("rows") Integer rows);
}