package com.protransfer.procurementtransfer.controller;

import com.protransfer.procurementtransfer.entity.MaterialEntity;
import com.protransfer.procurementtransfer.serivce.MaterialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: MaterialController
 * @Author ZhangZw
 * @Date: 2022/4/21 15:11
 * @Version 1.0
 * 物料Controller
 */
@Api(tags = "物料管理接口")
@RestController
@RequestMapping("material")
public class MaterialController {
    @Resource
    private MaterialService service;

    @Operation(summary = "物料新增")
    @PostMapping("add")
    public boolean addMaterial(@ApiParam(value = "物料对象", required = true)@RequestBody List<MaterialEntity> material){
        return service.saveBatch(material);
    }
}
