package top.hang.data.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import top.hang.data.entity.Discuss;

import java.util.Date;
import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description DiscussRepository 用于操作Discuss实体类
 * 继承 JpaRepository<Discuss, Integer>  第一个参数为实体类  第二个参数为主键类型
 * 写好接口后 就可以拼单词 例如 findByAuthorNotNull  表示根据author字段查询不为空的数据
 * 1.通过拼单词的方式查询数据
 * 2.通过自带的方法查询数据
 * 3.通过Query注解查询数据
 * 4.使用Example查询数据
 * @date 2023/3/20 14:16
 */
public interface DiscussRepository extends JpaRepository<Discuss, Integer>{
    /**
     * 根据author字段查询不为空的数据
     * @return List<Discuss>
     */
    List<Discuss> findByAuthorNotNull();

    /**
     * 根据author字段模糊查询
     * @param author 用户名
     * @return List<Discuss>
     */
    List<Discuss> findByAuthorLike(String author);

    /***
     * @description 根据author用户名和content内容模糊查询
     * @param author 用户名
     * @param content 内容
     * @return List<Discuss>
    */
    List<Discuss> findByAuthorLikeAndContentLike(String author, String content);

    /***
     * @description 根据author 用户名查询
     * @param author  用户名
     * @return  Discuss
    */
    Discuss findDiscussByAuthor (String author);


    /***
     * @description 查看content内容包含的数据
     * @param content 内容
     * @return List<Discuss>
    */
    List<Discuss> findByContentContains(String content);

    /***
     * @description 根据aId查询
     * @param aId 文章id
     * @return Discuss
    */
    List<Discuss> findByAIdEquals(Integer aId);

    /***
     * @description 查询时间大于某个时间的数据
     * @param time 时间
     * @return  List<Discuss>
    */
    List<Discuss> findDiscussByTimeAfter(Date time);

    /***
     * @description 分页查询
     * @param pageable 分页参数
     * @return List<Discuss>
    */
    @Query("SELECT c FROM t_comment c")
    List<Discuss> getDiscussByPage(Pageable pageable);


    /***
     * @description 分页查询 JPQL语句
     * @param pageable 分页参数 ?1表示第一个参数 ?2表示第二个参数
     * @param aId 文章id
     * @return List<Discuss>
     */
    @Query("SELECT c FROM t_comment c where c.AId = ?1")
    List<Discuss> getDiscussByPage1(Integer aId,Pageable pageable);


    /***
     * @description 分页查询 元素SQL语句 nativeQuery = true 表示使用原生的SQL语句
     * @param pageable 分页参数
     * @param aId 文章id
     * @return List<Discuss>
     */

    @Query(value = "SELECT * FROM t_comment  where a_id = ?1",nativeQuery = true)
    List<Discuss> getDiscussByPage2(Integer aId,Pageable pageable);
}
