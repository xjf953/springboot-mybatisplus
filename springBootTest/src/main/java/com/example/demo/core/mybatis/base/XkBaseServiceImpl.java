package com.example.demo.core.mybatis.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

public class XkBaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
}
