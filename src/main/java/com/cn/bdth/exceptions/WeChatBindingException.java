package com.cn.bdth.exceptions;


import lombok.Data;


/**
 * 登录授权类异常处理
 *
 *
 * @version 1.0
 */
@Data
@SuppressWarnings("all")
public class WeChatBindingException extends RuntimeException {

    private String message;

    private Integer code;


    public WeChatBindingException(final String message, final Integer code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public WeChatBindingException(final String message) {
        super(message);
        this.message = message;
        this.code = 500;
    }
}
