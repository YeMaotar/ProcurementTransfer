package com.protransfer.procurementtransfer.mapper.file;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.protransfer.procurementtransfer.entity.file.FileEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件数据服务
 * @author gosh
 */
@Mapper
public interface FileMapper{
    /**
     * 将数据信息插入到数据库
     * @param files
     */
    void insertFile(FileEntity files);

    /**
     * 根据id获取文件
     * @param id
     * @return
     */
    FileEntity selectFileById(String id);
}
