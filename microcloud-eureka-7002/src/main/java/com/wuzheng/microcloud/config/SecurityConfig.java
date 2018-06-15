package com.wuzheng.microcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @ClassName: SecurityConfig
 * @Package com.wuzheng.microcloud.config
 * @Author WuZheng
 * @Date 2018/6/15 14:01
 * @Description: springSecurity 配置
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

    @Bean
    public UserDetailsService userDetailsService() {
        // ensure the passwords are encoded properly
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("janewu").password("hello1").roles("USER")
                .passwordEncoder(encoder::encode).build());
        return manager;
    }
}
