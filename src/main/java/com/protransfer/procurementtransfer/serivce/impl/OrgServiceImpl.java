package com.protransfer.procurementtransfer.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.protransfer.procurementtransfer.entity.basicdata.OrgEntity;
import com.protransfer.procurementtransfer.mapper.basicdata.OrgMapper;
import com.protransfer.procurementtransfer.serivce.OrgService;
import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, OrgEntity>  implements OrgService {
}
