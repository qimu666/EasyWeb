package com.qimuu.easyweb.common;

/**
 * @Author: QiMu
 * @Date: 2023/08/16 02:54:36
 * @Version: 1.0
 * @Description: 错误返回接口, 自定义错误枚举实现该接口即可
 */
public interface Error {

    /**
     * 错误代码
     *
     * @return int
     */
    int getCode();

    /**
     * 错误描述
     *
     * @return {@link String}
     */
    String getMessage();

    /**
     * 系统错误 ()
     */
    int SYSTEM_ERROR = 50000;
}
