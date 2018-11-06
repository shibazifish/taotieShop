package com.taotieshop.demo.comm;

import com.taotieshop.demo.entity.result;
import com.taotieshop.demo.utils.resultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: 李宇
 * @Date: 2018/11/6 22:47
 * @Description:
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public result handle(Exception e){
        if(e instanceof TSException){
            TSException tsException = (TSException) e;
            return resultUtils.error(tsException.getCode(),tsException.getMessage());
        }
        logger.error("系统异常：{}",e.getMessage());
        return resultUtils.error(-1,"系统异常，请联系管理员！");
    }
}
