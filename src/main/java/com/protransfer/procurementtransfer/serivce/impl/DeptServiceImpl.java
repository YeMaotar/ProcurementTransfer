package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.DeptEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.DeptMapper;
import com.protransfer.procurementtransfer.serivce.DeptService;
import org.springframework.stereotype.Service;

/**
 * @title: DeptServiceImpl
 * @Author ZhangZw
 * @Date: 2022/4/21 19:30
 * @Version 1.0
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, DeptEntity> implements DeptService {
}
