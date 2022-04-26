package com.protransfer.procurementtransfer.entity.file;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * @title: FileEntity
 * @Author ZhangZw
 * @Date: 2022/4/25 15:28
 * @Version 1.0
 * 文件entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@TableName("file")
public class FileEntity implements Serializable {
    private static final long serialVersionUID=1L;
    /**
     * 文件存储路径
     */
    @TableField(exist=true)
    private String filePath;
    /**
     * 文件名称
     */
    @TableField(exist=true)
    private String fileName;
    /**
     * 文件后缀名
     */
    @TableField(exist=true)
    private String fileSuffix;

}
