package top.hang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hang.common.Result;
import top.hang.entity.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:39
 */
@RestController
public class CourseController {

    @GetMapping("/course")
    private Result getCourse() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Java", "未结课", "Ahang"));
        courses.add(new Course(2, "Python", "未结课", "Ahang"));
        courses.add(new Course(3, "C++", "结课", "Ahang"));
        courses.add(new Course(4, "C#", "结课", "Ahang"));
        Stream<Course> courseStream = courses.stream().filter(s -> "结课".equals(s.getStatus()));
        HashMap<String, Object> map = new HashMap<>();
        map.put("course", courseStream);
        Stream<Course> courseStream1 = courses.stream().filter(s -> "未结课".equals(s.getStatus()));
        map.put("course1", courseStream1);
        return Result.success(map);
    }
}
