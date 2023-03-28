package top.hang.exception;


import org.hibernate.service.spi.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.hang.common.Result;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:51
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = Exception.class)
    public Result exceptionError(Exception e) {
        return Result.error(500,"系统异常");
    }
    @ExceptionHandler(value = CustomServiceException.class)
    public Result serviceError(CustomServiceException e) {
        return Result.error(e.getCode(), "系统异常");
    }
}
