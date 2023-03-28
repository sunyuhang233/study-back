package top.hang.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return Result.builder().code(MyCustoms.SUCCESS).msg(MyCustoms.SUCCESS_MSG).data(data).build();
    }

    public static Result error(Integer code, String msg) {
        return Result.builder().code(code).msg(msg).build();
    }
}
