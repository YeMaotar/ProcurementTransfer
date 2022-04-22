package com.protransfer.procurementtransfer.controller.basicdata;


import com.protransfer.procurementtransfer.entity.basicdata.OrgEntity;
import com.protransfer.procurementtransfer.serivce.OrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "组织管理接口")
@RestController
@RequestMapping("org")
public class OrgController {
    @Resource
    private OrgService service;

    @Operation(summary = "组织新增")
    @PostMapping("add")
    public boolean addOrg(@ApiParam(value = "组织对象", required = true) @RequestBody List<OrgEntity> org){
        return service.saveBatch(org);
    }
}
