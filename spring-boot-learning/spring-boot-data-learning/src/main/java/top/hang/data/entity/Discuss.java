package top.hang.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * @author Ahang
 * @version 1.0
 * @description 对应数据库中的t_comment表  表名和实体类名不一致时需要指定name属性
 * @date 2023/3/20 14:09
 */
@Entity(name = "t_comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Discuss {
    // @Id 用于指定主键
    // @GeneratedValue 用于指定主键的生成策略  strategy类型为GenerationType.IDENTITY  表示主键自增
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String content;

    @Column(name = "a_id")
    // @Column 用于指定字段名  name属性表示字段名
    // Tips:如果是驼峰 先添加@Column注解 然后实体类中 下划线前面的字母大写 两个地方缺一不可
    private Integer AId;

    private Date time;
}
