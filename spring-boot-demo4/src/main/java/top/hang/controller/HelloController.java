package top.hang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 14:44
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }
}
