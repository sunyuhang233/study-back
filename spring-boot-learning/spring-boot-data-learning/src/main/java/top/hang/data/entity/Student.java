package top.hang.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/21 14:27
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Student {
    private Integer studentId;
    private String studentName;
    private Integer clazzId;
    // 学生所在的班级 一对一
   private String hometown;
   private LocalDate brithday;
   // 在多方中声明一方的对象
   private Clazz clazz;

   private List<Course> courses;

}
