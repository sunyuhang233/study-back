package top.hang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 22:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;

    private String password;

    private String city;

    private String phone;

    private String email;
    private String avatar;
    private String token;
}
