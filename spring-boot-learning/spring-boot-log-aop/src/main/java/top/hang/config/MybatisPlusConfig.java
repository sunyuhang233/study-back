package top.hang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 15:53
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.crush.log.mapper")
public class MybatisPlusConfig {

    /*** 分页*/
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        // 注册乐观锁 插件
        return mybatisPlusInterceptor;
    }

    /** 配置数据源 druid*/
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.druid")
    public DruidDataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
