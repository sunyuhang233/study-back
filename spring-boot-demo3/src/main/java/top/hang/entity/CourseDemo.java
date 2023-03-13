package top.hang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:47
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CourseDemo {
    private Integer id;
    private String name;
    private Integer status;
    private String author;
    private String url;
    private String level;
    private String avatar;
    private Integer isShow;
    private String time;
}
