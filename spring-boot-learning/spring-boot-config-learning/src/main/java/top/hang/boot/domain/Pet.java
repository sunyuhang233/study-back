package top.hang.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/14 13:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet {
    private String type;
    private String name;
}
