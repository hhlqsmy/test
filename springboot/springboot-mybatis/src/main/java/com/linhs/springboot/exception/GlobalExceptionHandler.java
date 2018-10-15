package com.linhs.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody Map<String,Object> error(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("error",-99);
        map.put("msg","error");
        return map;
    }
}
