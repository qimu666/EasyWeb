package com.qimuu.easyweb.exception;


import com.qimuu.easyweb.common.Error;

/**
 * 自定义异常类
 *
 * @author QiMu
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -2970393916478025106L;
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Error errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(Error errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
