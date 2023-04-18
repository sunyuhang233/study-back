package top.hang.email.service;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * @author Ahang
 * @version 1.0
 * @description 邮件服务
 * @date 2023/4/18 13:50
 */
@Service
public class MailService {
    @Resource
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from; // 发件人

    /**
     * 发送邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     */
    public void sendMail(String to, String subject, String content) {
        // 发送简单邮件
        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom(from);
        // 发件人
        message.setTo(to);
        // 主题
        message.setSubject(subject);
        // 内容
        message.setText(content);
        // 发送邮件
        javaMailSender.send(message);
    }

    /**
     * 发送复杂邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     * @throws MessagingException
     */
    public void sendComplexMail(String to, String subject, String content) throws MessagingException {
        // 发送复杂邮件
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        // 发送邮件
        javaMailSender.send(message);
    }
}
