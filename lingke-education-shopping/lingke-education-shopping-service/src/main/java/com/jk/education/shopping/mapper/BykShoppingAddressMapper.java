package com.jk.education.shopping.mapper;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BykShoppingAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BykShoppingAddress record);

    int insertSelective(BykShoppingAddress record);

    BykShoppingAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BykShoppingAddress record);

    int updateByPrimaryKey(BykShoppingAddress record);

    List<BykShoppingAddress> findShoppingAddressList(@Param("firstNum") int firstNum,@Param("lastNum") int lastNum,@Param("address") BykShoppingAddress address);

    Long findShoppingAddressCount(@Param("address") BykShoppingAddress address);

    @Delete("delete from byk_shopping_address where id = #{value}")
    void deleteShoppingAddressById(Integer id);

    @Select("select bsa.*,c1.Name as province,c2.Name as city,c3.Name as county from " +
            "    byk_shopping_address bsa,china c1,china c2 ,china c3 where bsa.provinceId = c1.Id " +
            "    and bsa.cityId = c2.id and bsa.countyId = c3.Id")
    List<BykShoppingAddress> findShoppingAddress();

    @Update("update byk_shopping_address set status = #{status} where id = #{id}")
    void updateShoppingAddressStatus(BykShoppingAddress address);

    @Select("select * from china where pid = #{value}")
    List<BykArea> findAreaList(int pid);

    @Insert("insert into byk_shopping_address (id, uid, provinceId,  " +
            "      cityId, countyId, address,  " +
            "      name, photo, status,  " +
            "      defaultAddress) " +
            "    values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, #{provinceId,jdbcType=INTEGER},  " +
            "      #{cityId,jdbcType=INTEGER}, #{countyId,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR},  " +
            "      #{name,jdbcType=VARCHAR}, #{photo,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER},  " +
            "      #{defaultAddress,jdbcType=INTEGER})")
    void saveShoppingAddress(BykShoppingAddress address);

    @Select("select * from byk_shopping_address where id = #{value}")
    BykShoppingAddress findShoppingAddressById(int id);

    @Update("update byk_shopping_address  " +
            "    set uid = #{uid,jdbcType=INTEGER},  " +
            "      provinceId = #{provinceId,jdbcType=INTEGER},  " +
            "      cityId = #{cityId,jdbcType=INTEGER},  " +
            "      countyId = #{countyId,jdbcType=INTEGER},  " +
            "      address = #{address,jdbcType=VARCHAR},  " +
            "      name = #{name,jdbcType=VARCHAR},  " +
            "      photo = #{photo,jdbcType=VARCHAR},  " +
            "      status = #{status,jdbcType=INTEGER},  " +
            "      defaultAddress = #{defaultAddress,jdbcType=INTEGER}  " +
            "    where id = #{id,jdbcType=INTEGER}")
    void updateShoppingAddress(BykShoppingAddress address);
}