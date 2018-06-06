package com.wuzheng.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @ClassName: SecurityConfig
 * @Package com.wuzheng.microcloud.config
 * @Author WuZheng
 * @Date 2018/6/5 20:38
 * @Description: SpringSecurity配置文件
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
        http.csrf().disable();
        SessionManagementConfigurer sessionConfigurer = http.sessionManagement();
        sessionConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
