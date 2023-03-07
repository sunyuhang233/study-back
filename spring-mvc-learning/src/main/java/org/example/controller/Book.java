package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 17:08
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Book {
    private String name;
    private String author;
    private Double price;
    private String avatar;

}
