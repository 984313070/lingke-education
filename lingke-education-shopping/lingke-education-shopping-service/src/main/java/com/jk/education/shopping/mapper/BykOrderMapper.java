package com.jk.education.shopping.mapper;

import com.jk.education.shopping.common.model.BykOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BykOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BykOrder record);

    int insertSelective(BykOrder record);

    BykOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BykOrder record);

    int updateByPrimaryKey(BykOrder record);

	List<BykOrder> findOrderList(@Param("firstNum") int firstNum,@Param("lastNum") int lastNum,@Param("order") BykOrder order);

	@Select("select bo.*,c1.Name as province,c2.Name as city,c3.Name as county from byk_order bo,china c1,china c2 ,china c3  where bo.provinceId = c1.Id and bo.cityId = c2.id and bo.countyId = c3.Id")
    List<BykOrder> findOrder(BykOrder order);

    Long findOrderCount(@Param("order") BykOrder order);

    @Delete("delete from byk_order where id = #{id}")
    void deleteOrderById(Integer id);

    @Select("select bo.*,c1.Name as province,c2.Name as city,c3.Name as county from byk_order bo,china c1,china c2 ,china c3  where bo.provinceId = c1.Id and bo.cityId = c2.id and bo.countyId = c3.Id and bo.id = #{id}")
    BykOrder findOrderById(int id);
}