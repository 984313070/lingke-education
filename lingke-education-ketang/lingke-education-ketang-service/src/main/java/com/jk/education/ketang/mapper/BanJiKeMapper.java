package com.jk.education.ketang.mapper;

import com.jk.education.ketang.common.model.BanJiKe;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BanJiKeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BanJiKe record);

    int insertSelective(BanJiKe record);

    BanJiKe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BanJiKe record);

    int updateByPrimaryKey(BanJiKe record);

    int findcountbjliebiaoAll(@Param ("banJiKe") BanJiKe banJiKe);

    List<Map> findbjliebiaoAll(@Param ("banJiKe") BanJiKe banJiKe, @Param ("start") int start, @Param ("rows") Integer rows);

    void updbjfenxiaostatus(Integer id, Integer bjfenxiaostatus);

    void updbjdelstatus(Integer id, Integer status);

    int findclountbjhishouzhanAll(BanJiKe banJiKe);

    List<Map> findbjhishouzhanAll(BanJiKe banJiKe, int start, Integer rows);
}