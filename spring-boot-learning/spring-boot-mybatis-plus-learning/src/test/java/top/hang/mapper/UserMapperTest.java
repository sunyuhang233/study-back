package top.hang.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.entity.User;

import java.sql.Wrapper;
import java.util.*;
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
    void queryUpdate() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("age", 20);

        User user = new User();
        user.setName("修改年龄为20的用户");
        int i = userMapper.update(user, wrapper);
        System.out.println("i = " + i);
    }

    @Test
    void querySelect3() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // like模糊查询
        wrapper.like("name", "J");
        wrapper.like("email", "t");
        List<User> list = userMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void querySelect4() {
        // ● all 表示所有
        //● Eq 是 equal 的缩写表示相等关系
        //构造条件
        QueryWrapper<User> query = new QueryWrapper<>();
        Map<String, Object> params = new HashMap<>();
        params.put("name", "张三");
        params.put("age", 18);
        params.put("email", null);
        // allEq表示所有的等于关系 传入的map中的key对应的是数据库中的列名
        // ● 第一个参数是过滤器（可选参数），lambda表达式表示(k, v) -> !k.equals("name")，参数的 Key 不能是name，所以 params.put("name", "字母哥");
        // 这个查询条件被过滤掉
        //● 第二个参数表示传入所有的 params 查询参数
        //● 第三个参数（可选参数），表示如果值为 null 是否按 IS NULL 查询，false 则忽略 null 列的查询，所以 params.put("email", null);这个查询条件被过滤掉

// query.allEq(params,false);
        query.allEq((k, v) -> !k.equals("name"), params, false);
        List<User> list = userMapper.selectList(query);
        list.forEach(System.out::println);
    }

    // lambda条件构造器
    @Test
    void querySelect5() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        // lt表示小于 le表示小于等于  gt表示大于  ge表示大于等于
        wrapper.like(User::getName, "J").lt(User::getAge, 22);
        List<User> list = userMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void querySelect6() {
        // likeRight表示右模糊查询 likeLeft表示左模糊查询 like表示全模糊查询
        List<User> list = new LambdaQueryChainWrapper<User>(userMapper)
                .likeRight(User::getName, "张三")
                .and(q -> q.lt(User::getAge, 40)
                        .or()
                        .isNotNull(User::getEmail)
                )
                .list();
        list.forEach(System.out::println);
    }

    @Test
    void selectUser() {
        String name = "张三";  //name不为空
        String email = "";   //email为空串
        List<User> list = userMapper.findUser(name, email);
        list.forEach(System.out::println);
    }


    //    @Test
//     void testCustomSQL2() {
//        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
//        query.eq(User::getName, "张三");
//        List<User> list = userMapper.selectAll((Wrapper) query);
//        list.forEach(System.out::println);
//    }
    @Test
    public void testCustomSQL2() {
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
        query.eq(User::getName, "张三");
        List<User> list = userMapper.selectAll(query);
        list.forEach(System.out::println);
    }
    // 分页查询
    @Test
    void pageSelect(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.lt(User::getAge, 40);
        Page<User> page = new Page<> (1,10);
        Page<User> userPage = userMapper.selectPage(page, wrapper);
        long current = userPage.getCurrent();//当前页
        long pages = userPage.getPages();//总页数
        long size = userPage.getSize();//每页显示的条数
        long total = userPage.getTotal();//总条数
        List<User> records = userPage.getRecords();//数据list集合
        System.out.println("current = " + current);
        System.out.println("pages = " + pages);
        System.out.println("size = " + size);
        System.out.println("total = " + total);
        System.out.println("records = " + records);
    }
    // 做分页数据查询，不查询总条数。设置 page 分页的第三个参数为 false。
    @Test
    void pageSelect1(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.lt(User::getAge, 40);
        // 设置 page 分页的第三个参数为 false 不查询总条数
        Page<User> page = new Page<> (1,10,false);
        Page<User> userPage = userMapper.selectPage(page, wrapper);
        long current = userPage.getCurrent();//当前页
        long pages = userPage.getPages();//总页数
        long size = userPage.getSize();//每页显示的条数
        long total = userPage.getTotal();//总条数
        List<User> records = userPage.getRecords();//数据list集合
        System.out.println("current = " + current);
        System.out.println("pages = " + pages);
        System.out.println("size = " + size);
        System.out.println("total = " + total);
        System.out.println("records = " + records);
    }
//    @Test
//    void pageSelect2(){
//        UserVo userVo = new UserVo();
//        userVo.setAgeStart(25);
//        userVo.setHobby("看书");
//        Page<User> page = new Page<>(1, 10);
//        userMapper.selectUserPage(page, userVo);
//        System.out.println("总页数：" + page.getPages());
//        System.out.println("总记录数：" + page.getTotal());
//        List<User> list = page.getRecords();
//        list.forEach(System.out::println);
//    }
}