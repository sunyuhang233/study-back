package top.hang.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 16:11
 */
@Entity(name = "t_article")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String img;
}
