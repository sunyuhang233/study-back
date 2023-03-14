package top.hang.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.hang.service.impl.SplitServiceImpl;

@Configuration
@ConditionalOnClass(value = {ISplitService.class, SplitServiceImpl.class})
public class SplitAutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    ISplitService startService() {
        return new SplitServiceImpl();
    }
}