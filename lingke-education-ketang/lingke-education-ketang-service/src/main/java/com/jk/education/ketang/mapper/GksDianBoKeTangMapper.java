package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.GksDianBoKeTang;

import java.util.List;

public interface GksDianBoKeTangMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GksDianBoKeTang record);

    int insertSelective(GksDianBoKeTang record);

    GksDianBoKeTang selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GksDianBoKeTang record);

    int updateByPrimaryKey(GksDianBoKeTang record);

    List<GksDianBoKeTang> gksfinddianbokechengAll(GksDianBoKeTang gksDianBoKeTang);

    void gksUpdJinyongStatus(Integer id, Integer jinyongstatus);

    void gksUpdshangxiajiaStatus(Integer id, Integer shangxiajiastatus);

    void gksUpdfenxiaoStatus(Integer id, Integer fenxiaostatus);

    List<GksDianBoKeTang> finddianbokechenghszAll();

    void delhszAll(Integer[] ids);
}