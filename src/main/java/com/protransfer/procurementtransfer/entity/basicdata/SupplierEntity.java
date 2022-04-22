package com.protransfer.procurementtransfer.entity.basicdata;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: SupplierEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 19:12
 * @Version 1.0
 */
@Data
@ApiModel("供应商模型")
@TableName(value = "bd_supplier")
public class SupplierEntity implements Serializable {
    @ApiModelProperty("供应商主键")
    private String pk;
    @ApiModelProperty("供应商编码")
    private String code;
    @ApiModelProperty("供应商名称")
    private String name;
    @ApiModelProperty("启用状态")
    private String enablestate;
}
