package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.ObjectEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.ObjectMapper;
import com.protransfer.procurementtransfer.serivce.ObjectService;
import org.springframework.stereotype.Service;

/**
 * @title: ObjectServiceImpl
 * @Author ZhangZw
 * @Date: 2022/4/22 08:59
 * @Version 1.0
 */
@Service
public class ObjectServiceImpl extends ServiceImpl<ObjectMapper, ObjectEntity> implements ObjectService {
}
