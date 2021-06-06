package com.album.common.result;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:24
 */
@ControllerAdvice
public class RRExceptionHandler {
    @ExceptionHandler(RRException.class)
    public RR handler(RRException exception){
        return RR.error(exception.getMsg());
    }
}
