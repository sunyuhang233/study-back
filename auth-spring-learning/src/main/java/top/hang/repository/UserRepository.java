package top.hang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.hang.entity.User;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:48
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUsernameAndPassword(String username,String password);

    User findUserByUsername(String username);
}
