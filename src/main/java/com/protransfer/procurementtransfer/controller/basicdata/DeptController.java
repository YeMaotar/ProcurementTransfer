package com.protransfer.procurementtransfer.controller.basicdata;

import com.protransfer.procurementtransfer.entity.basicdata.DeptEntity;
import com.protransfer.procurementtransfer.serivce.DeptService;
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
 * @title: DeptController
 * @Author ZhangZw
 * @Date: 2022/4/22 08:56
 * @Version 1.0
 */
@Api(tags = "部门管理接口")
@RestController
@RequestMapping("dept")
public class DeptController {
    @Resource
    private DeptService service;

    @Operation(summary = "部门新增")
    @PostMapping("add")
    public boolean addDept(@ApiParam(value = "部门对象", required = true)@RequestBody List<DeptEntity> dept){
        return service.saveBatch(dept);
    }
}
