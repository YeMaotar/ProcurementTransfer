package com.protransfer.procurementtransfer.entity.basicdata;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: ObjectEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 19:10
 * @Version 1.0
 */
@Data
@ApiModel("工号模型")
@TableName(value = "bd_object")
public class ObjectEntity implements Serializable {
    @ApiModelProperty("工号主键")
    private String pk;
    @ApiModelProperty("工号编码")
    private String code;
    @ApiModelProperty("工号名称")
    private String name;
    @ApiModelProperty("所属组织")
    private String org;
    @ApiModelProperty("启用状态")
    private String enablestate;
    @ApiModelProperty("时间戳")
    private String ts;
}
