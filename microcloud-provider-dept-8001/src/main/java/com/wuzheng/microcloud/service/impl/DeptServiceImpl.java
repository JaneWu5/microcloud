package com.wuzheng.microcloud.service.impl;

import com.wuzheng.microcloud.dao.DeptDao;
import com.wuzheng.microcloud.entity.Dept;
import com.wuzheng.microcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Package com.wuzheng.microcloud.service.impl
 * @Author WuZheng
 * @Date 2018/6/4 17:36
 * @Description: 实现类
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    @Override
    public Integer createNew(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
