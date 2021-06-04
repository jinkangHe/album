package com.album.app.controller;

import com.album.common.result.RR;
import com.album.common.util.FastDFSUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:22
 */
@RestController
@RequestMapping("/img/")
public class ImageController {

    @Autowired
    private FastDFSUtil fastDFSUtil;

    // 上传文件
    @PostMapping
    @ApiOperation("上传图片")
    public RR<String> upload(MultipartFile file){
        String fileUrl= fastDFSUtil.uploadFile(file);
        return RR.ok(fileUrl);
    }
}
