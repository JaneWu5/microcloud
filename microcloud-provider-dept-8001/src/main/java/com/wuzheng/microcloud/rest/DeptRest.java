package com.wuzheng.microcloud.rest;

import com.wuzheng.microcloud.entity.Dept;
import com.wuzheng.microcloud.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DeptRest
 * @Package com.wuzheng.microcloud.rest
 * @Author WuZheng
 * @Date 2018/6/4 19:08
 * @Description: RestController
 */
@RestController
@RequestMapping("/dept")
public class DeptRest {
    @Resource
    private DeptService deptService;

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @PostMapping("/add")
    public Integer add(Dept dept) {
        return deptService.createNew(dept);
    }
}
