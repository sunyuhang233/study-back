package top.hang.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.hang.data.entity.Discuss;
import top.hang.data.service.PageService;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 15:12
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private PageService pageService;

    // 分页查询
    // @RequestParam("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize
    // defaultValues = "1"  默认值为1  设置默认值

    @GetMapping("/page/{pageNum}/{pageSize}")
    public List<Discuss> page(
            @RequestParam("pageNum") Integer pageNum,
            @PathVariable("pageSize") Integer pageSize
    ){
        return pageService.page(pageNum, pageSize);
    }

}
