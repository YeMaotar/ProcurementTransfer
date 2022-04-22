package com.protransfer.procurementtransfer.controller.basicdata;

import com.protransfer.procurementtransfer.entity.basicdata.PsonEntity;
import com.protransfer.procurementtransfer.serivce.PsonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: PsonController
 * @Author ZhangZw
 * @Date: 2022/4/21 15:11
 * @Version 1.0
 * 人员Controller
 */
@Api(tags = "人员管理接口")
@RestController
@RequestMapping("pson")
public class PsonController {
    @Resource
    private PsonService service;

    @Operation(summary = "物料新增")
    @PostMapping("add")
    public boolean addPson(@ApiParam(value = "人员对象", required = true)@RequestBody List<PsonEntity> pson){
        return service.saveBatch(pson);
    }
}
