package top.hang.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hang.common.Result;
import top.hang.entity.Spring;
import top.hang.mapper.SpringMapper;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/23 15:46
 */
@RestController
public class SpringController {
    @Resource
    private SpringMapper springMapper;

    @GetMapping("/spring")
    public Result spring(){
        List<Spring> springMapperAll = springMapper.findAll();
        return Result.success("查询成功",200,springMapperAll);
    }
}
