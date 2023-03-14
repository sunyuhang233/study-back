package top.hang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Course {
    private Integer id;
    private String name;
    private String status;
    private String author;



}
