package com.protransfer.procurementtransfer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
/**
 * @title: MaterialController
 * @Author ZhangZw
 * @Date: 2022/4/21 15:11
 * @Version 1.0
 * 物料Entity
 */
@Data
@ApiModel("物料模型")
@TableName(value = "bd_material")
public class MaterialEntity implements Serializable {
    @ApiModelProperty("物料主键")
    private String pk;
    @ApiModelProperty("物料编码")
    private String code;
    @ApiModelProperty("物料名称")
    private String name;
    @ApiModelProperty("物料分类")
    private String classcode;
    @ApiModelProperty("计量单位")
    private String measdoc;
    @ApiModelProperty("规格")
    private String spec;
    @ApiModelProperty("类型")
    private String type;
    @ApiModelProperty("启用状态")
    private String enablestate;
    @ApiModelProperty("时间戳")
    private String ts;
}
