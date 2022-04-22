package com.protransfer.procurementtransfer.entity.basicdata;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @title: DeptEntity
 * @Author ZhangZw
 * @Date: 2022/4/21 19:06
 * @Version 1.0
 */
@Data
@ApiModel("部门模型")
@TableName(value = "bd_dept")
public class DeptEntity implements Serializable {
    @ApiModelProperty("部门主键")
    private String pk;
    @ApiModelProperty("部门编码")
    private String code;
    @ApiModelProperty("部门名称")
    private String name;
    @ApiModelProperty("部门分类")
    private String classcode;
    @ApiModelProperty("所属组织")
    private String org;
    @ApiModelProperty("启用状态")
    private String enablestate;
    @ApiModelProperty("时间戳")
    private String ts;
}
