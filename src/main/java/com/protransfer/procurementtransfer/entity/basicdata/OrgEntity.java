package com.protransfer.procurementtransfer.entity.basicdata;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: OrgEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 19:04
 * @Version 1.0
 */
@Data
@ApiModel("业务单元模型")
@TableName(value = "bd_org")
public class OrgEntity implements Serializable {
    @ApiModelProperty("组织主键")
    private String pk;
    @ApiModelProperty("组织编码")
    private String code;
    @ApiModelProperty("组织名称")
    private String name;
    @ApiModelProperty("组织分类")
    private String classcode;
    @ApiModelProperty("启用状态")
    private String enablestate;
}
