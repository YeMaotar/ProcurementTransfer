package com.protransfer.procurementtransfer.controller.basicdata;

import com.protransfer.procurementtransfer.entity.basicdata.SupplierEntity;
import com.protransfer.procurementtransfer.serivce.SupplierService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "供应商管理接口")
@RestController
@RequestMapping("supplier")
public class SupplierController {
    @Resource
    private SupplierService service;

    @Operation(summary = "供应商新增")
    @PostMapping("add")
    public boolean addSupplier(@ApiParam(value = "供应商对象", required = true) @RequestBody List<SupplierEntity> supper){
        return service.saveBatch(supper);
    }
}
