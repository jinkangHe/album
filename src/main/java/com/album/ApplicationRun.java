package com.album;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:03
 */
@Import(FdfsClientConfig.class)//只需要一行注解 @Import(FdfsClientConfig.class)就可以拥有带有连接池的FastDFS Java客户端了
@SpringBootApplication
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }
}
