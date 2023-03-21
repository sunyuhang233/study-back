package top.hang.data.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.data.entity.Article;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ArticleRepositoryTest {
    @Autowired
    private ArticleRepository articleRepository;
    @Test
    void contextLoads() {
        List<Article> repositoryAll = articleRepository.findAll();
        System.out.println(repositoryAll);
    }
}