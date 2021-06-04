package com.album.common.util;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:16
 */
@Component
public class FastDFSUtil {
    @Autowired
    private FastFileStorageClient client;

    @Value("${params.fastdfs.rootUrl}")
    private String rootPath;

    public String uploadFile(MultipartFile file){
        StorePath storePath = null;
        try(InputStream inputStream = file.getInputStream();) {
            storePath = client.uploadFile(inputStream,file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()),null);
        } catch (IOException e) {

        }

        return getResAccessUrl(storePath);
    }

    // 封装文件完整URL地址
    private String getResAccessUrl(StorePath storePath) {
        String fileUrl = rootPath + storePath.getFullPath();
        return fileUrl;
    }
}
