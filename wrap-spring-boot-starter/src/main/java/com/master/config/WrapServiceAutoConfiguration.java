package com.master.config;

import com.master.service.WrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 */
@Configuration
@ConditionalOnClass(WrapService.class)
@EnableConfigurationProperties(WrapServiceProtorties.class)
public class WrapServiceAutoConfiguration {

    @Autowired
    private WrapServiceProtorties protorties;

    @Bean
    @ConditionalOnProperty(name = "wrap.service.enabled", matchIfMissing = false)
//    @ConditionalOnProperty(name = "wrap.service.enabled", havingValueValue = "true", matchIfMissing = true)
    public WrapService wrapService2(){
        return new WrapService(protorties.getPrefix(), protorties.getSuffix());
    }

    @Bean
    @ConditionalOnMissingBean
    public WrapService wrapService(){
        return new WrapService("", "");
    }

}
