package com.album.app.mapper;

import com.album.app.entity.Photo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 16:12
 */
@Mapper
public interface IPhotoMapper extends BaseMapper<Photo> {
}
