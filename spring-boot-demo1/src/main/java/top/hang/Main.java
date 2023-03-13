package top.hang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("maven搭建spring-boot项目");
        SpringApplication.run(Main.class, args);
    }
}