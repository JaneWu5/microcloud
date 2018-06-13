package com.wuzheng.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: Dept8001StartSpringCloudApplication
 * @Package com.wuzheng.microcloud
 * @Author WuZheng
 * @Date 2018/6/4 17:42
 * @Description: springBoot程序启动类
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
public class Dept8001StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dept8001StartSpringCloudApplication.class);
    }
}
