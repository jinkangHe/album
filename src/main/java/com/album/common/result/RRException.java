package com.album.common.result;

import lombok.Data;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:23
 */
@Data
public class RRException extends RuntimeException{

    private String msg;
    private int code;
    private static int ERROR_CODE = 500;
    public RRException(){

    }

    public RRException(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public RRException(String msg) {
        this.msg = msg;
        this.code = ERROR_CODE;
    }
}
