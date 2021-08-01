package com.example.redisconfig.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.redisconfig.entity.LjsTest;
import com.example.redisconfig.mapper.LjsTestMapper;
import com.example.redisconfig.service.LjsTestService;
import org.springframework.stereotype.Service;

/**
 * @Author: Liu js
 * @Date: 2021/07/31/22:15
 * @Description:
 */
@Service
public class LjsTestServiceImpl extends ServiceImpl<LjsTestMapper, LjsTest> implements LjsTestService {
}
