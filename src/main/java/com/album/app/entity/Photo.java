package com.album.app.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 15:32
 */
@Data
@TableName("photo")
public class Photo {
    @Id
    private int id;

    private String photoName;

    private String photoUrl;

    private String photoOwner;
}
