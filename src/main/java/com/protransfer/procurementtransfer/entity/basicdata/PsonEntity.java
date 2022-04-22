package com.protransfer.procurementtransfer.entity.basicdata;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: PsonEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 18:59
 * @Version 1.0
 */
@Data
@ApiModel("人员模型")
@TableName(value = "bd_posn")
public class PsonEntity implements Serializable {
    @ApiModelProperty("人员主键")
    private String pk;
    @ApiModelProperty("人员编码")
    private String code;
    @ApiModelProperty("人员名称")
    private String name;
    @ApiModelProperty("业务单元")
    private String org;
    @ApiModelProperty("部门")
    private String dept;
    @ApiModelProperty("身份证")
    private String id;
    @ApiModelProperty("手机")
    private String phone;
    @ApiModelProperty("启用状态")
    private String enablestate;
}
