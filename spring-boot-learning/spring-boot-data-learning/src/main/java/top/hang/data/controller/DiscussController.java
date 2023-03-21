package top.hang.data.controller;

import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.hang.data.entity.Discuss;
import top.hang.data.repository.DiscussRepository;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 15:58
 */
@Controller
public class DiscussController {

    @Resource
    private DiscussRepository discussRepository;

    @GetMapping("/discuss")
    public String getDiscuss(ModelMap modelMap){
        PageRequest pageRequest = PageRequest.of(0, 10);
        List<Discuss> discuss = discussRepository.getDiscussByPage1(1, pageRequest);
        modelMap.addAttribute("discussList", discuss);
        modelMap.put("title", "你好");
        return "index.html";
    }

}
