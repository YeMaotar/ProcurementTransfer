package com.protransfer.procurementtransfer.controller.basicdata;

import com.protransfer.procurementtransfer.entity.basicdata.ObjectEntity;
import com.protransfer.procurementtransfer.serivce.ObjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "项目管理接口")
@RestController
@RequestMapping("object")
public class ObjectController {
    @Resource
    private ObjectService service;

    @Operation(summary = "项目新增")
    @PostMapping("add")
    public boolean addObject(@ApiParam(value = "项目对象", required = true) @RequestBody List<ObjectEntity> obj){
        return service.saveBatch(obj);
    }


}
