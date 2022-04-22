package com.protransfer.procurementtransfer.controller.basicdata;


import com.protransfer.procurementtransfer.entity.basicdata.StordocEntity;
import com.protransfer.procurementtransfer.serivce.StordocService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "仓库管理接口")
@RestController
@RequestMapping("stordoc")
public class StordocController {
    @Resource
    private StordocService  service;

    @Operation(summary = "仓库新增")
    @PostMapping("add")
    public boolean addStord(@ApiParam(value = "仓库对象", required = true) @RequestBody List<StordocEntity> stordoc){
        return service.saveBatch(stordoc);
    }
}
