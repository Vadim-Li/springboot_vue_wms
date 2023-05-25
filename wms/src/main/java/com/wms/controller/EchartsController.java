package com.wms.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wms.mapper.EchartsMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/echarts")
public class EchartsController {
    @Resource
    private EchartsMapper echartsMapper;
    @GetMapping("")
    public Object echarts(){
        //查询数据库echarts表的所有数据
        return echartsMapper.selectList(Wrappers.lambdaQuery());
    }
}
