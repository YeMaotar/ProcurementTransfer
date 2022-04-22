package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.SupplierEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.SupplierMapper;
import com.protransfer.procurementtransfer.serivce.SupplierService;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, SupplierEntity> implements SupplierService {
}
