package top.hang.repository;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.entity.User;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;
    @Test
    void findUserByUsernameAndPassword() {
        User admin = userRepository.findUserByUsernameAndPassword("admin", "123456");
        System.out.println(admin.getPassword());
    }
}