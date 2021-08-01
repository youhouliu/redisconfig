package com.example.redisconfig.TestController;

import com.example.redisconfig.entity.LjsTest;
import com.example.redisconfig.mapper.LjsTestMapper;
import com.example.redisconfig.service.LjsTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Liu js
 * @Date: 2021/07/31/22:19
 * @Description:
 */

@Slf4j
@Controller
@RequestMapping("ljs")

public class TestController {

    @Autowired
    private LjsTestMapper ljsTestMapper;

    @GetMapping(value = "/ljs")
    public void test(){
        String str = "ljs";
        LjsTest ljsTest = ljsTestMapper.selectById(1);
        log.info("ljs:{}",ljsTest);
        return;
    }




}
