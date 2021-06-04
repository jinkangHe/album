package com.album.app.service;

import com.album.app.entity.Photo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 16:13
 */

public interface IPhotoService extends IService<Photo> {
    /**
     * 上传图片
     * @param file
     * @return
     */
    String uploadPhoto(MultipartFile file);
}
