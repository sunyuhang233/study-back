package top.hang.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.hang.common.MyCustoms;
import top.hang.common.Result;
import top.hang.enums.MyEnums;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:13
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {
    @ExceptionHandler(value= CustomException.class)
    public Result customException(CustomException e){
        if(e.getCode().equals(MyEnums.ERROR.getCode())){
            log.error("发生了系统异常，异常信息为：{}",e.getMessage());
        }
        return Result.error(e.getCode(),e.getMessage());
    }
}
