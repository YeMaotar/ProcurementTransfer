package com.protransfer.procurementtransfer.controller.file;

import com.protransfer.procurementtransfer.common.ResponseCode;
import com.protransfer.procurementtransfer.common.Result;
import com.protransfer.procurementtransfer.entity.file.FileEntity;
import com.protransfer.procurementtransfer.serivce.FileService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @title: FileController
 * @Author ZhangZw
 * @Date: 2022/4/25 15:56
 * @Version 1.0
 * 文件上传接口
 */
@RestController
@RequestMapping("/file")
public class FileController {
    @Resource
    private FileService fileService;

    /**
     * 上传数据
     * @param multipartFile
     * @return
     */
    @PostMapping(value = "/upload")
    public Result upLoadFiles(MultipartFile multipartFile){
        if (multipartFile.isEmpty()){
            return new Result(ResponseCode.FILE_EMPTY.getCode(),ResponseCode.FILE_EMPTY.getMsg(),null);
        }
        return fileService.upLoadFiles(multipartFile);
    }

    /**
     * 下载数据
     * @param id
     * @param request
     * @param response
     */
    @GetMapping(value = "/download")
    public void downloadFiles(@RequestParam(value="id") String id, HttpServletRequest request, HttpServletResponse response){
        OutputStream outputStream=null;
        InputStream inputStream=null;
        BufferedInputStream bufferedInputStream=null;
        byte[] bytes=new byte[1024];
        FileEntity files = fileService.getFileById(id);
        String fileName = files.getFileName();
        // 获取输出流
        try {
            //解决下载文件时文件名乱码问题
            byte[] fileNameBytes = fileName.getBytes(StandardCharsets.UTF_8);
            fileName = new String(fileNameBytes, 0, fileNameBytes.length, StandardCharsets.ISO_8859_1);


            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.setContentType("application/force-download");


            inputStream=fileService.getFileInputStream(files);
            bufferedInputStream=new BufferedInputStream(inputStream);
            outputStream = response.getOutputStream();
            int i=bufferedInputStream.read(bytes);
            while (i!=-1){
                outputStream.write(bytes,0,i);
                i=bufferedInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null){
                    inputStream.close();
                }
                if (outputStream!=null){
                    outputStream.close();
                }
                if (bufferedInputStream!=null){
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
