package top.hang.data.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import top.hang.data.entity.Discuss;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class DiscussRepositoryTest {
    @Autowired
    private  DiscussRepository discussRepository;

    /**
     * 根据author字段查询不为空的数据
     */
    @Test
    void findByAuthorNotNull() {
        List<Discuss> discussList = discussRepository.findByAuthorNotNull();
        System.out.println(discussList);
    }

    /**
     * 根据author字段模糊查询
     */
    @Test
    void findByAuthorLike(){
        List<Discuss> tom = discussRepository.findByAuthorLike("tom");
        System.out.println(tom);
    }

    /***
     * @description 根据author用户名和content内容模糊查询
     */
    @Test
    void findByAuthorLikeAndContentLike(){
        List<Discuss> tom = discussRepository.findByAuthorLikeAndContentLike("tom", "赞一个");
        System.out.println(tom);
    }

    /***
     * @description 根据author 用户名查询
     */
    @Test
    void findDiscussByAuthor(){
        Discuss discuss = discussRepository.findDiscussByAuthor("tom");
        System.out.println(discuss);
    }

    /***
     * @description 根据content内容查看包含的数据
     */
    @Test
    void DiscussContains(){
        List<Discuss> discuss = discussRepository.findByContentContains("很");
        System.out.println(discuss);
    }

    /***
     * @description 根据aId查询
     */
    @Test
    void findByAIdEquals(){
        List<Discuss> discuss = discussRepository.findByAIdEquals(1);
        System.out.println(discuss);
    }

    /***
     * @description 查询时间大于某个时间的数据
    */
    @Test
    void findByCreateTimeAfter(){
        List<Discuss> discuss = discussRepository.findDiscussByTimeAfter(new Date());
        System.out.println(discuss);
    }

    /***
     * @description 使用内部自带的方法查询
    */
    @Test
    void selectContent(){
        Optional<Discuss> discussOptional = discussRepository.findById(1); // 默认是Optional类型 判空 需要get 也可以使用ifPresent
        discussOptional.ifPresent(discuss -> System.out.println(discuss.getContent()));
        Discuss discuss = discussOptional.get();
        System.out.println(discuss.getContent());
    }

    /***
     * @description 分页查询
    */
    @Test
    void getDiscussByPage(){
        PageRequest pageRequest = PageRequest.of(0, 2);
//        List<Discuss> discuss = discussRepository.findAll(pageRequest).getContent();
        discussRepository.getDiscussByPage(pageRequest).forEach(discuss -> System.out.println(discuss));
    }

    /***
     * @description 使用Query注解查询
    */
    @Test
    void getDiscussByQuery(){
        PageRequest pageRequest = PageRequest.of(0, 2);
        List<Discuss> discuss = discussRepository.getDiscussByPage1(2, pageRequest);
        discuss.forEach(discuss1 -> System.out.println(discuss1));
    }

    /***
     * @description 使用Example查询
    */
    @Test
    void getDiscussByExample(){
        Discuss discuss = new Discuss();
        discuss.setAuthor("tom");
        Example<Discuss> discussExample = Example.of(discuss);
        List<Discuss> discussList = discussRepository.findAll(discussExample);
        discussList.forEach(System.out::println);
    }

    /***
     * @description 使用Example查询 通过匹配
    */

    @Test
    void getDiscussByExample1(){
        Discuss discuss = new Discuss();
        discuss.setAuthor("t");
        ExampleMatcher matcher =
                ExampleMatcher.matching().withMatcher("author", ExampleMatcher.GenericPropertyMatchers.startsWith());
        Example<Discuss> discussExample = Example.of(discuss,matcher);
        List<Discuss> discussList = discussRepository.findAll(discussExample);
        discussList.forEach(System.out::println);

    }

    @Test
    void getPage(){
        PageRequest pageRequest = PageRequest.of(0, 2);
        List<Discuss> discuss = discussRepository.getDiscussByPage2(1, pageRequest);
        discuss.forEach(System.out::println);
    }

}