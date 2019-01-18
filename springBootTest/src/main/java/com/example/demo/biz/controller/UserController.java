package com.example.demo.biz.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.biz.entity.TbUser;
import com.example.demo.biz.service.impl.TbUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private TbUserServiceImpl tbUserService;
    @RequestMapping("test")
    public Object userTest(){
        TbUser tbUser = tbUserService.selectById(1);
        return tbUser.toString();
    }

    @RequestMapping("page")
    public JSONObject pageTest(){
        Page<TbUser> userPage = tbUserService.selectPage(new Page<>(1,10));
        JSONObject result = new JSONObject();
        result.put("userPage",userPage);
        return  result;
    }
}
