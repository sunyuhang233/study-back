package top.hang.file.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinIoConfigTest {
    @Autowired
    private MinIoConfig minIoConfig;

    @Test
    void create() {
        try {
            minIoConfig.makeBucket("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void upload() {
        try {
            minIoConfig.uploadObject("test", "one.jpg", "C:\\Users\\Ahang\\Desktop\\upload\\20230410\\1.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void delete() {
        try {
            minIoConfig.removeObject("test", "one.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}