package top.hang.common;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:17
 */
public interface MyCustoms {
    Integer SUCCESS = 200;
    Integer ERROR = 400;
    Integer SYSTEM_ERROR = 500;
    Integer BUSINESS_ERROR = 501;
    Integer PARAM_ERROR = 502;
    Integer FILE_ERROR = 503;
    String FILE_ERROR_MSG="认证失败";
    String NO_LOGIN_MSG = "未登录";
    String SUCCESS_MSG = "操作成功";
    String ERROR_MSG = "操作失败";
    String SYSTEM_ERROR_MSG = "系统错误";
    String BUSINESS_ERROR_MSG = "业务错误";
    String PARAM_ERROR_MSG = "参数错误";
    String PARAM_ERROR_MSG2 = "参数错误2";

}
