package org.example.work;

import java.util.ArrayList;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:30
 */
public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"张三", (double) 3000));
        list.add(new Employee(2,"李四", (double) 5000));
        list.add(new Employee(3,"王五", (double) 4000));

        list.stream().forEach(item->{
            System.out.println(item.getName());
            System.out.println(item.getSalary());
        });


    }
}
