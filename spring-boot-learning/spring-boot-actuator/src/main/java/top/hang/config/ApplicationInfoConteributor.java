package top.hang.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author : Ahang
 * @program : study-back-main
 * @description : ApplicationInfoContributor
 * @create : 2023-04-18 15:39
 **/
@Component
public class ApplicationInfoConteributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("author", "Ahang");
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Ahang");
        map.put("age", 18);
        builder.withDetail("user", map);
    }
}
