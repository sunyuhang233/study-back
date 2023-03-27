package top.hang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/23 15:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Spring {
    private Integer id;
    private String title;
    private String describe;
    private String img;
}
