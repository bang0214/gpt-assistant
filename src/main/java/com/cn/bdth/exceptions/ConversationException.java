package com.cn.bdth.exceptions;


/**
 *
 * @version 1.0
 */
public class ConversationException extends Exception {


    public ConversationException(String message) {
        super(message);
    }


    public ConversationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
