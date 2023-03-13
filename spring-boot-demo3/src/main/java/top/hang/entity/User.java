package top.hang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String name;
    private Integer age;
}
