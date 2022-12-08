package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.ShdzEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;



@Mapper
public interface ShdzDao extends BaseMapper<ShdzEntity> {
    @Update("update shdz set default_shipping_address = 0 ")
    void reSetAddr();
    @Update("update shdz set default_shipping_address = 1 where id = #{id}")
    void setAddr(int id);
}
