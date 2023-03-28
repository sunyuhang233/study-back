package top.hang.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hang.common.Result;
import top.hang.entity.Article;
import top.hang.service.ArticleService;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 14:20
 */
@RestController
@RequestMapping("/api")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @GetMapping("/article/{id}")
    public Result getArticle(@PathVariable Integer id) {
        if(id>3){
            articleService.systemError(id);
        }
        if(id<=0){
            articleService.businessError(id);
        }
        return Result.success(findArticleById(id));
    }
    private Article findArticleById(Integer id){
        List<Article> articleList = List.of(new Article(1, "spring boot", "spring boot learning"), new Article(2,
                "spring cloud", "spring cloud learning"), new Article(3, "spring", "spring learning"));
        return articleList.stream().filter(s -> s.getId().equals(id)).toList().get(0);
    }
}
