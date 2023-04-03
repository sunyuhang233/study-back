package top.hang.common;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 22:28
 */
public interface Common {
    Integer SUCCESS_CODE = 200;
    Integer ERROR_CODE = 400;
    Integer UN_LOGIN_TOKEN_CODE = 403;
    String LOGIN_ERROR_MSG = "登录已过期，请重新登录";
    String UN_ROLE_MSG = "无权限";
    String UN_LOGIN_TOKEN = "token不存在";
    String LOGIN_ERROR_MSG2 = "用户名或密码错误";
    String LOGIN_SUCCESS_MSG = "登录成功";
    String REGISTER_SUCCESS_MSG = "注册成功";
    String REGISTER_ERROR_MSG = "注册失败";
    String USER_NOT_EXIST_MSG = "用户不存在";
    String USER_EXIST_MSG = "用户已存在";
    String USER_NOT_LOGIN_MSG = "用户未登录";
    String USER_LOGIN_SUCCESS_MSG = "用户登录成功";
    String SUCCESS_MSG = "操作成功";
}
