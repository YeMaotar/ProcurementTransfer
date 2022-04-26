package com.protransfer.procurementtransfer.serivce.impl;

import com.protransfer.procurementtransfer.common.ResponseCode;
import com.protransfer.procurementtransfer.common.Result;
import com.protransfer.procurementtransfer.entity.file.FileEntity;
import com.protransfer.procurementtransfer.mapper.file.FileMapper;
import com.protransfer.procurementtransfer.serivce.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * @title: FileServiceImpl
 * @Author ZhangZw
 * @Date: 2022/4/25 15:33
 * @Version 1.0
 */
@Service
public class FileServiceImpl  implements FileService {
    //@Value("${file.save-path}")
    private String savePath = "/Users/gosh";
    @Autowired
    private FileMapper fileMapper;

    @Override
    public Result upLoadFiles(MultipartFile file) {
        long MAX_SIZE=2097152L;
        String fileName=file.getOriginalFilename();
        if (StringUtils.isEmpty(fileName)){
            return new Result(ResponseCode.FILE_NAME_EMPTY.getCode(),ResponseCode.FILE_NAME_EMPTY.getMsg(),null);
        }
        if (file.getSize()>MAX_SIZE){
            return new Result(ResponseCode.FILE_MAX_SIZE.getCode(),ResponseCode.FILE_MAX_SIZE.getMsg(),null);
        }
        String suffixName = fileName.contains(".") ? fileName.substring(fileName.lastIndexOf(".")) : null;
        String newName = System.currentTimeMillis() + suffixName;
        File newFile=new File(savePath,newName);
        if (!newFile.getParentFile().exists()){
            newFile.getParentFile().mkdirs();
        }
        try {
            //文件写入
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileEntity files=new FileEntity(newFile.getPath(),fileName,suffixName);
        fileMapper.insertFile(files);
        return new Result(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMsg(),"数据上传成功");
    }

    @Override
    public FileEntity getFileById(String id) {
        FileEntity files = fileMapper.selectFileById(id);
        return files;
    }

    @Override
    public InputStream getFileInputStream(FileEntity files) {
        File file=new File(files.getFilePath());
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
