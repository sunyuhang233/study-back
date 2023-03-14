package top.hang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hang.common.Result;
import top.hang.entity.Course;
import top.hang.entity.CourseDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:49
 */

@RestController
public class CourseTestController {

    @GetMapping("/courseDemo")
    public Result getCourse(){
        ArrayList<CourseDemo> courses = new ArrayList<>();
        courses.add(new CourseDemo(1,"后端工程化开发",1,"许莫淇","https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/e81eb0929b869d2098cb441da709ae66.jpeg?x-oss-process=style/s300x300","软件2242 Web2班","https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300",1,"2023-03-13 15:47:00"));
        courses.add(new CourseDemo(2,"前端工程化开发",1,"许莫淇","https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/effaea97669cecb86c6b9e9d2dce54cd.jpg?x-oss-process=style/s300x300","软件2242 Web2班","https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300",1,"2023-03-13 15:57:00"));
        courses.add(new CourseDemo(3,"Web应用开发",1,"许莫淇","https://public-cdn-oss.mosoteach.cn/mssvc/cover/2023/02/319aa0a5a02386312000d5df99aa1a9d.jpeg?x-oss-process=style/s300x300","软件2242 Web2班","https://public-cdn-oss.mosoteach.cn/avatar/2020/01/a2f12c73eed9ee74b87f8f05865a8d3b.jpg?v=1579922683&x-oss-process=style/s300x300",1,"2023-03-13 15:59:00"));
        courses.add(new CourseDemo(4,"游亦有道之旅游文化",0,"刘畅","https://public-cdn-oss.mosoteach.cn/mssvc/cover/2019/11/0a349326aa36862dda4d60b323396a6e.jpg?x-oss-process=style/s300x300","海门公选课","https://public-cdn-oss.mosoteach.cn/avatar/2018/63/62d0daf7e64b0e7da8eb41009e56dc31.jpg?v=1537007710&x-oss-process=style/s300x300",1,"2021-03-13 16:00:00"));
        HashMap<String, Object> hashMap = new HashMap<>();
        List<CourseDemo> courseDemoList = courses.stream().filter(s -> s.getStatus() == 1).collect(Collectors.toList());
        List<CourseDemo> courseDemoList1 = courses.stream().filter(s -> s.getStatus() == 0).collect(Collectors.toList());
        hashMap.put("class",courseDemoList);
        hashMap.put("endClass",courseDemoList1);
        return Result.success(hashMap);
    }
}
