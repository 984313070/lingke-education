package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.GksKejianku;
import com.jk.education.ketang.common.model.GksShipintantitiku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GksKejiankuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GksKejianku record);

    int insertSelective(GksKejianku record);

    GksKejianku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GksKejianku record);

    int updateByPrimaryKey(GksKejianku record);

    int findTotalAll(@Param("gksKejianku")GksKejianku gksKejianku);

    List<GksKejianku> findketangkuAll(@Param("gksKejianku")GksKejianku gksKejianku,@Param ("start") int start, @Param ("rows") Integer rows);

    void kejiankujinyong(Integer id, Integer kjstatus);

    void delKejianku(Integer id);

}