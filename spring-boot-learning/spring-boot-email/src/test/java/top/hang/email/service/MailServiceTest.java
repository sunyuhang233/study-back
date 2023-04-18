package top.hang.email.service;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import top.hang.email.entity.Article;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MailServiceTest {
    @Resource
    private MailService mailService;
    @Resource
    private FreeMarkerConfig freeMarkerConfig;

    @Test
    void sendMail() {
        mailService.sendMail("2541226493@qq.com", "测试邮件", "这是一封测试邮件");
    }

    @Test
    void sendComplexMail() throws Exception {
        String h1 = "<div style=\"background-color: #0000ff; color: #ff0000; font-size: 20px;\">这是一个测试邮件</div>";
        mailService.sendComplexMail("2283582431@qq.com", "测试邮件", h1);
    }

    @Test
    void sendFtl() throws IOException, TemplateException, MessagingException {
        List<Article> articles = List.of(
                new Article(1, "标题1", new Date()),
                new Article(2, "标题2", new Date()),
                new Article(3, "标题3", new Date())
        );
        Template template = freeMarkerConfig.getConfiguration().getTemplate("mail.ftl");
        HashMap<String, Object> map = new HashMap<>();
        map.put("articles", articles);
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        mailService.sendComplexMail("2283582431@qq.com", "测试邮件", content);

    }
}