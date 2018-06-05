package com.wuzheng.microcloud.service;

import com.wuzheng.microcloud.entity.Dept;

import java.util.List;

/**
 * @ClassName: DeptService
 * @Package com.wuzheng.microcloud.service
 * @Author WuZheng
 * @Date 2018/6/4 17:32
 * @Description: dept服务接口
 */
public interface DeptService {
    Boolean createNew(Dept dept);

    Dept findById(Long deptNo);

    List<Dept> list();
}
