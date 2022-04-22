package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.protransfer.procurementtransfer.entity.basicdata.StordocEntity;

import com.protransfer.procurementtransfer.mapper.basicdata.StordocMapper;
import com.protransfer.procurementtransfer.serivce.StordocService;
import org.springframework.stereotype.Service;

@Service
public class StordocServiceImpl extends ServiceImpl<StordocMapper, StordocEntity> implements StordocService{
}
