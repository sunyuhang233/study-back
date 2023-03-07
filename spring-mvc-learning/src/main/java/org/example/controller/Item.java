package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 21:41
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private String name;
    private String title;
    private String avatar;
}
