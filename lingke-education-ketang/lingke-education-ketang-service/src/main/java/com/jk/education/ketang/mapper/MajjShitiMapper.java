package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.MajjShiti;

import java.util.List;

public interface MajjShitiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MajjShiti record);

    int insertSelective(MajjShiti record);

    MajjShiti selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MajjShiti record);

    int updateByPrimaryKey(MajjShiti record);

    List<MajjShiti> findshitileixing();
}