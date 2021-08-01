package com.example.redisconfig.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Liu js
 * @Date: 2021/07/31/22:12
 * @Description:
 */
@Data
@TableName("ljstest")
public class LjsTest {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
    private String telephone;
}
