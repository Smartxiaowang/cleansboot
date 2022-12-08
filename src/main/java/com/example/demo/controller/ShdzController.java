package com.example.demo.controller;

import com.example.demo.entity.ShdzEntity;
import com.example.demo.serviceImpl.ShdzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class ShdzController {

    @Autowired
    private ShdzServiceImpl shdzService;

    @GetMapping("/reSetAddr")
    public HashMap reSetAddr(@RequestParam(name = "id", required = false) int id) {
        shdzService.setAddr(id);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code", 200);
        return objectObjectHashMap;
    }

    @GetMapping("/getShdzDataList")
    public HashMap getShdzDataList(@RequestParam(name = "page", required = false) int page,
                                   @RequestParam(name = "limit", required = false) int limit) {
        return shdzService.getShdzDataList(page, limit);
    }

    @GetMapping("/delShdzById")
    public HashMap delShdzById(@RequestParam(name = "id", required = false) int id) {
        shdzService.delShdzById(id);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code", 200);
        return objectObjectHashMap;
    }

    @PostMapping("/updOrShdzById")
    public HashMap updShdzById(@RequestBody ShdzEntity shdzEntity) {
        if (shdzEntity.getDefaultShippingAddress() != null) {
            //说明新增或修改的=为默认地址
            shdzEntity.setDefaultShippingAddress("1");
            //更新数据表其他数据为普通地址
            shdzService.reSetAddr();
        }else {
            shdzEntity.setDefaultShippingAddress("0");
        }
        if (shdzEntity.getId() != null)
            shdzService.updShdzById(shdzEntity);
        else
            shdzService.saveShdz(shdzEntity);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code", 200);
        return objectObjectHashMap;
    }

    @GetMapping("/saveShdz")
    public HashMap saveShdz(@RequestBody ShdzEntity shdzEntity) {
        shdzService.saveShdz(shdzEntity);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code", 200);
        return objectObjectHashMap;
    }
}
