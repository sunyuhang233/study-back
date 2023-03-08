package org.example.controller.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/8 19:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginUser {
    private String id;
    private String name;
    private String password;
}
