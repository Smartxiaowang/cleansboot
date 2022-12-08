package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("shdz")
public class ShdzEntity {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    private String address;

    private String postalCode;

    private String prefixPhoneNumber;

    private String phoneNumber;

    private String defaultShippingAddress;

    private String detailedAddress;

    private String username;
}
