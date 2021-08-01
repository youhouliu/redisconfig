package com.example.redisconfig.RedisController;

import com.example.redisconfig.Utils.RedisUtils;
import com.example.redisconfig.entity.LjsTest;
import com.example.redisconfig.mapper.LjsTestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Liu js
 * @Date: 2021/07/27/22:00
 * @Description:
 */
@Slf4j
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private LjsTestMapper ljsTestMapper;

    @RequestMapping(value = "/ljs")
    public String hello(@PathVariable(value = "id") String id) {
        //查询缓存中是否存在
        boolean hasKey = redisUtils.exists(id);
        String str = "";
        LjsTest ljsTest = ljsTestMapper.selectById(1);
        log.info("ljs:{}",ljsTest);
        //从数据库中获取信息
        log.info("从数据库中获取数据");
        //数据插入缓存（set中的参数含义：key值，user对象，缓存存在时间10（long类型），时间单位）
//        redisUtils.remove(new String[]{"name", "name2"});
        redisUtils.remove("1","2");
        log.info("数据插入缓存" + str);

        return str;
    }


}
