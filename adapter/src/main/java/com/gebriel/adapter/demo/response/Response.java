package com.gebriel.adapter.demo.response;

import lombok.Data;

/**
 * @author lizhenjiang
 */
@Data
public class Response {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private Object data;
}
