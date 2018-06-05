package com.wuzheng.microcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestConfig
 * @Package com.wuzheng.microcloud.config
 * @Author WuZheng
 * @Date 2018/6/5 10:40
 * @Description: 配置RestTemplate
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
