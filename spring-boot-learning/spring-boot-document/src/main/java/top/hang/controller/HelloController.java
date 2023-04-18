package top.hang.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ahang
 * @program : study-back-main
 * @description :
 * @create : 2023-04-18 16:29
 **/
@RestController
@Tag(name = "HelloController", description = "HelloController")
public class HelloController {
    @GetMapping("/hello")
    @Operation(summary = "hello", description = "hello接口")
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello1")
    @Operation(summary = "hello1", description = "hello1接口")
    public String hello1() {
        return "hello";
    }
}
