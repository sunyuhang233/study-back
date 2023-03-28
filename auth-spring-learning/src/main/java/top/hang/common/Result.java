package top.hang.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 22:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(String msg,Object data){
        return Result.builder().code(200).msg(msg).data(data).build();
    }
    public static Result error(String msg){
        return Result.builder().msg(msg).build();
    }
    public static Result error(Integer code,String msg){
        return Result.builder().code(code).msg(msg).build();
    }
}