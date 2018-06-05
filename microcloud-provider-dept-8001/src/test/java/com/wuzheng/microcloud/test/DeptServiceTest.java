package com.wuzheng.microcloud.test;

import com.wuzheng.microcloud.Dept8001StartSpringCloudApplication;
import com.wuzheng.microcloud.entity.Dept;
import com.wuzheng.microcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @ClassName: DeptServiceTest
 * @Package com.wuzheng.microcloud.test
 * @Author WuZheng
 * @Date 2018/6/4 17:51
 * @Description: 测试DeptService类
 */
@SpringBootTest(classes = Dept8001StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DeptServiceTest {
    @Resource
    private DeptService deptService;

    @Test
    public void find() {
        System.out.println(deptService.findById(1L));
        System.out.println(deptService.list());
    }

    @Test
    public void create() {
        deptService.createNew(new Dept("人力资源部", "dbLoc"));
    }
}
