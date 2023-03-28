package top.hang.exception;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:51
 */
public class CustomServiceException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public CustomServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomServiceException(String message) {
        super(message);
    }

    public CustomServiceException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
