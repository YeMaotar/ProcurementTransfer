package com.protransfer.procurementtransfer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: StordocEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 19:08
 * @Version 1.0
 */
@Data
@ApiModel("仓库模型")
@TableName(value = "bd_stordoc")
public class StordocEntity implements Serializable {
    @ApiModelProperty("仓库主键")
    private String pk;
    @ApiModelProperty("仓库编码")
    private String code;
    @ApiModelProperty("仓库名称")
    private String name;
    @ApiModelProperty("所属组织")
    private String org;
    @ApiModelProperty("启用状态")
    private String enablestate;
    @ApiModelProperty("时间戳")
    private String ts;
}
