package top.hang.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("tb_user")
public class LogUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String passwrod;

    /*** 逻辑删除字段 */
    @TableLogic
    private Integer deleted;

    /*** 创建时间*/
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /*** 修改时间*/
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
