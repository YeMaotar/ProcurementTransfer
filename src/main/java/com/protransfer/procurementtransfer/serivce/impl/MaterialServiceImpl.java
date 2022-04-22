package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.MaterialEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.MaterialMapper;
import com.protransfer.procurementtransfer.serivce.MaterialService;
import org.springframework.stereotype.Service;
/**
 * @title: MaterialServiceImpl
 * @Author ZhangZw
 * @Date: 2022/4/21 15:30
 * @Version 1.0
 */
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper,MaterialEntity> implements MaterialService{

}

