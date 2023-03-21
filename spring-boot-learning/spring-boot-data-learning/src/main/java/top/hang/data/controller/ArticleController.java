package top.hang.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.hang.data.entity.Article;
import top.hang.data.entity.Discuss;
import top.hang.data.repository.ArticleRepository;
import top.hang.data.repository.DiscussRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Ahang
 * @version 1.0
 * @description 分类和评论控制器
 * @date 2023/3/20 16:18
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private DiscussRepository discussRepository;

    @GetMapping("/article")
    public String article(ModelMap modelMap) {
        List<Article> articleRepositoryAll = articleRepository.findAll();
        modelMap.addAttribute("articles", articleRepositoryAll);
        return "article.html";
    }

    @GetMapping("/article/{id}")
    public String articleDetail(ModelMap modelMap,@PathVariable("id") Integer id) {
        Optional<Article> repositoryById = articleRepository.findById(id);
        Article article = repositoryById.get();
        modelMap.addAttribute("article", article);
        List<Discuss> discusses = discussRepository.findByAIdEquals(id);
        modelMap.addAttribute("discusses", discusses);
        return "articleDetail.html";
    }
}
