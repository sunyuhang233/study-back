package top.hang.boot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/14 14:35
 * @Component 注解：把Student类的实例作为Bean注入到Spring容器中
 */

@Component

public class Student {

    @Value("#{1+1}") // SpEL表达式
    private Integer id;
    @Value("${student.name}")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
