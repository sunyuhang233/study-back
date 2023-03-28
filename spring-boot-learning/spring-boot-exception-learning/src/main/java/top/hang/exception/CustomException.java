package top.hang.exception;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义异常
 * 细节：自定义异常类，需要继承RuntimeException，实现序列化接口
 * 里面定义一个异常码和异常信息
 * 构造方法 有参可以传递自定义的枚举类型，也可以传递异常信息
 * @date 2023/3/28 14:12
 */
public class CustomException extends RuntimeException {
    private Integer code;
    private String message;

    public CustomException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CustomException(String message) {
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
