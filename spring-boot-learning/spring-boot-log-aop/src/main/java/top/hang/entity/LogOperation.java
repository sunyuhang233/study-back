package top.hang.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 15:56
 */
@Data
@Accessors(chain = true)
@TableName("tb_log")
public class LogOperation implements Serializable {

    private static final long serialVersionUID = 7925874058046995566L;

    private String id;
    /*** 用户id 操作人ID */
    private String userId;
    /** * 用户名称 关联admin_user */
    private String username;
    /** * 登录ip */
    private String loginIp;
    /** * 操作类型(0登录、1查询、2修改) 这个根据自己需求定义即可 ，还有很多其他方式，这个并不完善，只是刚刚够用的那种  */
    private int type;

    /** *  操作的url*/
    private String url;
    /**  * 操作内容 */
    private String operation;
    /** * 操作时间*/
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /*** 备注*/
    private String remark;
    /*** 修改时间*/
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
