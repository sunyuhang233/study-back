package top.hang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private Integer id;
    private String title;
    private String author;
}
