package com.album.app.service.impl;

import com.album.app.entity.Photo;
import com.album.app.mapper.IPhotoMapper;
import com.album.app.service.IPhotoService;
import com.album.common.util.FastDFSUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 16:14
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<IPhotoMapper, Photo> implements IPhotoService {
    @Autowired
    private FastDFSUtil fastDFSUtil;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String uploadPhoto(MultipartFile file) {
        String fileUrl = fastDFSUtil.uploadFile(file);
        Photo photo = new Photo();
        photo.setPhotoUrl(fileUrl);
        photo.setPhotoName(FilenameUtils.getExtension(file.getName()));
        this.save(photo);
        return fileUrl;
    }
}
