package top.hang.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
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
    @Min(value = 2,message = "id不能小于2")
    private Integer id;
    @NotEmpty(message = "标题不能为空")
    private String title;
    @NotEmpty(message = "作者名不能为空")
    private String author;
}
