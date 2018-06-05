package com.wuzheng.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName: SecurityConfig
 * @Package com.wuzheng.microcloud.config
 * @Author WuZheng
 * @Date 2018/6/5 20:38
 * @Description: SpringSecurity配置文件
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
