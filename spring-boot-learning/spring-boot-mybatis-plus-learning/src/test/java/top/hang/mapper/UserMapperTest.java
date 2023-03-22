package top.hang.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.mysql.cj.Query;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.entity.User;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void insert(){
        User user = new User();
        user.setId(6L);
        user.setName("Ahang");
        user.setAge(18);
        user.setEmail("test@11.com");
        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
    }

    @Test
    void selectById(){
        User user = userMapper.selectById(6L);
        System.out.println("user = " + user);
    }

    @Test
    void updateById() {
        User user = new User();
        user.setId(6L);
        user.setName("测试数据");
        int updateById = userMapper.updateById(user);
        System.out.println("updateById = " + updateById);
    }

    @Test
    void deleteById(){
        int deleteById = userMapper.deleteById(6L);
        System.out.println("deleteById = " + deleteById);
    }

    @Test
    void selectListByIds(){
        ArrayList<Long> longArrayList = new ArrayList<>();
        longArrayList.add(1L);
        longArrayList.add(2L);
        List<User> userList = userMapper.selectBatchIds(longArrayList);
        userList.forEach(System.out::println);
    }

    @Test
    void selectByMap(){
        HashMap<String, Object> map = new HashMap<>();
        //map的key指代的是mysql表中的列名，并非java实体的属性名
        map.put("name", "Jone");
        userMapper.selectByMap(map).forEach(System.out::println);
    }

    @Test
    void querySelect1(){
        QueryWrapper<User> query = new QueryWrapper<>();
        query.select("name", "age")   //指定查询结果字段
                .in("age", Arrays.asList(18,19))
                .last("limit 1");
        List<User> list = userMapper.selectList(query);
        list.forEach(System.out::println);
    }

    @Test
    void querySelect2(){
        QueryWrapper<User> query = new QueryWrapper<>();
        query.like("name", "J%")    //like是MP的条件构造器，表示"模糊查询"
                .lt("age", 22)     //lt是MP的条件构造器，表示"小于"关系
                .select("name", "age");
        List<Map<String, Object>> maps = userMapper.selectMaps(query);
        maps.forEach(System.out::println);
    }

    @Test
    void queryUpdate(){
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("age",20);

        User user = new User();
        user.setName("修改年龄为20的用户");
        int i = userMapper.update(user, wrapper);
        System.out.println("i = " + i);
    }
}