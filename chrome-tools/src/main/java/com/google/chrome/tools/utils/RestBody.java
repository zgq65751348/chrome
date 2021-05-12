package com.google.chrome.tools.utils;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RestBody {

    private int code;
    private String message;
    private Object data;

    public static RestBody success(HttpStatus httpStatus,Object data){
        return RestBody.builder().code(httpStatus.getCode()).message(httpStatus.getMessage()).data(data).build();
    }

    public static RestBody success(HttpStatus httpStatus){
        return RestBody.builder().code(httpStatus.getCode()).message(httpStatus.getMessage()).build();
    }

    public static RestBody failure(HttpStatus httpStatus){
        return RestBody.builder().code(httpStatus.getCode()).message(httpStatus.getMessage()).build();
    }
}
