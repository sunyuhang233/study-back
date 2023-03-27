package top.hang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/23 15:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String msg;
    private Integer code;
    private Object data;

    public static Result success(String msg, Integer code, Object data){
        return new Result(msg,code,data);
    }

}
