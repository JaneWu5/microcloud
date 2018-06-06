package com.wuzheng.microcloud.controller;

import com.wuzheng.microcloud.entity.Dept;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DeptController
 * @Package com.wuzheng.microcloud.controller
 * @Author WuZheng
 * @Date 2018/6/5 10:45
 * @Description: 消费DeptRest微服务
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController {
    public static final String DEPT_GET_URL = "http://localhost:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://localhost:8001/dept/list";
    public static final String DEPT_ADD_URL = "http://localhost:8001/dept/add";

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;

    @GetMapping("/get")
    public Dept getDept(Long id) {
//        Dept dept = restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
        Dept dept = restTemplate.exchange(DEPT_GET_URL + id, HttpMethod.GET,
                new HttpEntity<>(headers), Dept.class).getBody();
        return dept;
    }

    @GetMapping("/list")
    public List<Dept> listDept() {
//        List<Dept> deptList = restTemplate.getForObject(DEPT_LIST_URL, List.class);
        List<Dept> deptList = restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET,
                new HttpEntity<>(headers), List.class).getBody();
        return deptList;
    }

    @GetMapping("/add")
    public Boolean addDept(Dept dept) {
//        return restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
        return restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST,
                new HttpEntity<>(dept, headers), Boolean.class).getBody();
    }
}
