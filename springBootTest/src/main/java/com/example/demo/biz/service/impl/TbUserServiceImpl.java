package com.example.demo.biz.service.impl;

import com.example.demo.biz.entity.TbUser;
import com.example.demo.biz.mapper.TbUserMapper;
import com.example.demo.biz.service.ITbUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xjf
 * @since 2019-01-18
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
