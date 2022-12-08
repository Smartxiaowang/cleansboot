package com.example.demo.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.ShdzDao;
import com.example.demo.entity.ShdzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName ShdzServiceImpl
 * @Description TODO
 * @Author Dear lin
 * @Date 12:21 2022/11/26
 * @Version 1.0
 **/
@Service
public class ShdzServiceImpl extends ServiceImpl<ShdzDao, ShdzEntity> {

    @Resource
    private ShdzDao shdzDao;


    public HashMap getShdzDataList(int cut, int pag) {
        QueryWrapper<ShdzEntity> default_shipping_address = new QueryWrapper<ShdzEntity>().orderByDesc("default_shipping_address");
        Page<ShdzEntity> shdzEntityPage = shdzDao.selectPage(new Page<>(cut, pag),default_shipping_address);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("data", shdzEntityPage.getRecords());
        objectObjectHashMap.put("code", 0);
        objectObjectHashMap.put("count", shdzEntityPage.getTotal());
        return objectObjectHashMap;
    }

    public void delShdzById(int id) {
        shdzDao.deleteById(id);
    }

    public void updShdzById(ShdzEntity shdzEntity) {
        shdzDao.updateById(shdzEntity);
    }

    public void saveShdz(ShdzEntity shdzEntity) {
        shdzDao.insert(shdzEntity);
    }

    public void reSetAddr() {
        shdzDao.reSetAddr();
    }

    public void setAddr(int id) {
        //取消其他的默认
        shdzDao.reSetAddr();
        //设置当前为默认
        shdzDao.setAddr(id);
    }

}
