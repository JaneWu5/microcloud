package com.wuzheng.microcloud.dao;

import com.wuzheng.microcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: DeptDao
 * @Package com.wuzheng.microcloud.dao
 * @Author WuZheng
 * @Date 2018/6/4 16:50
 * @Description: 链接Dept的myBatis Dao
 */
@Mapper
public interface DeptDao {
    Integer insert(Dept dept);

    Dept findById(Long deptNo);

    List<Dept> findAll();
}
