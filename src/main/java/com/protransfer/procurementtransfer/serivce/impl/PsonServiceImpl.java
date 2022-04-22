package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.PsonEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.PsonMapper;
import com.protransfer.procurementtransfer.serivce.PsonService;
import org.springframework.stereotype.Service;

/**
 * @title: PsonServiceImpl
 * @Author ZhangZw
 * @Date: 2022/4/22 08:54
 * @Version 1.0
 */
@Service
public class PsonServiceImpl extends ServiceImpl<PsonMapper, PsonEntity> implements PsonService {
}
