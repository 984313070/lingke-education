package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.GksKejianku;
import com.jk.education.ketang.common.model.GksShipintantitiku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GksShipintantitikuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GksShipintantitiku record);

    int insertSelective(GksShipintantitiku record);

    GksShipintantitiku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GksShipintantitiku record);

    int updateByPrimaryKey(GksShipintantitiku record);

    int findshipintantiTotalAll(@Param ("gksShipintantitiku") GksShipintantitiku gksShipintantitiku);

    List<GksShipintantitiku> findshipintantiAll(@Param ("gksShipintantitiku") GksShipintantitiku gksShipintantitiku, @Param ("start") int start, @Param ("rows") Integer rows);

    void delshipintanti(Integer id);
}