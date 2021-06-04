package com.album.common.result;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jinkang He
 * @version 1.0
 * @date 2021/6/4 14:23
 */
@Data
public class RR<T> {
    private static final Logger log = LoggerFactory.getLogger(RR.class);
    public static final int OK = 200;
    public static final int ERROR = 500;
    private int code;
    private String msg;
    private T result;

    public RR() {
        this(OK);
    }

    public RR(int code) {
        this(code, "success");
    }

    public RR(String msg) {
        this(OK, msg);
    }

    public RR(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RR<?> error() {
        return error(ERROR, "非预期异常，请联系管理员");
    }

    public static RR<?> error(String msg) {
        return error(ERROR, msg);
    }

    public static RR<?> error(int code, String msg) {
        return new RR(code, msg);
    }

    public static <TT> RR<TT> ok(TT t) {
        RR<TT> r = new RR();
        r.result = t;
        return r;
    }

    public static RR<?> ok() {
        return new RR();
    }


}
