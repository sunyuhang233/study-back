package top.hang.enums;

import lombok.Getter;
import top.hang.common.MyCustoms;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:16
 */
@Getter
public enum MyEnums {
    SUCCESS(MyCustoms.SUCCESS, MyCustoms.SUCCESS_MSG),
    ERROR(MyCustoms.SYSTEM_ERROR, MyCustoms.ERROR_MSG),

    SYSTEM_ERROR(MyCustoms.SYSTEM_ERROR, MyCustoms.SYSTEM_ERROR_MSG);

    private Integer code;
    private String msg;

    MyEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
