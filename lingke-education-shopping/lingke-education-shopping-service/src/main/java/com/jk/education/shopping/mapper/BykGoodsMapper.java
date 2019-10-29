package com.jk.education.shopping.mapper;

import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BykGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BykGoods record);

    int insertSelective(BykGoods record);

    BykGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BykGoods record);

    int updateByPrimaryKey(BykGoods record);
	
	List<BykGoods> findGoodsAll(BykGoods goods);

    Long findCount(BykGoods goods);

    Long findGoodsCount(BykGoods goods);

    @Update("update byk_goods set status = #{status} where id = #{id}")
    void updateGoodsStatus(BykGoods goods);

    @Delete("delete from byk_goods where id in (${value})")
    void deleteGoods(String ids);

    @Update("update byk_goods set status = 2 where id = #{id}")
    void updateStatus(Integer id);

    List<BykGoods> findGoodsRecycleAll(BykGoods goods);

    Long findGoodsRecycleCount(BykGoods goods);

    @Update("update byk_goods set status = 0 where id = #{id}")
    void updateGoodsRecycleStatus(int id);

    @Select("select * from byk_goods_type where pid = #{value}")
    List<BykGoodsType> findGoodsTypeList(int pid);
}