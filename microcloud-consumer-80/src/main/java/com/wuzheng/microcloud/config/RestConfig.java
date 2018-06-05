package com.wuzheng.microcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

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
    public HttpHeaders getHttpHeaders() { //Http头信息配置
        HttpHeaders headers = new HttpHeaders();
        String auth = "wuzheng:hello";
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);
        return headers;
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
