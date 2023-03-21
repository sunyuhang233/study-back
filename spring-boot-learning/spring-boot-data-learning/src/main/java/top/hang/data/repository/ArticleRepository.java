package top.hang.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.hang.data.entity.Article;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 16:13
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
