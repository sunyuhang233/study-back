package top.hang;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : Ahang
 * @program : study-back-main
 * @description :
 * @create : 2023-04-18 15:56
 **/
@SpringBootApplication
@EnableAdminServer
public class AdminService {
    public static void main(String[] args) {
        SpringApplication.run(AdminService.class, args);
    }
}
