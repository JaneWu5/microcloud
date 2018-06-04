package com.wuzheng.microcloud.entity;

import java.io.Serializable;

/**
 * @ClassName: Dept
 * @Package com.wuzheng.entity
 * @Author WuZheng
 * @Date 2018/6/4 15:41
 * @Description: 部门返回VO
 */
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    private String dbLoc;

    public Dept() {
    }

    public Dept(String deptName, String dbLoc) {
        this.deptName = deptName;
        this.dbLoc = dbLoc;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbLoc() {
        return dbLoc;
    }

    public void setDbLoc(String dbLoc) {
        this.dbLoc = dbLoc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", dbLoc='" + dbLoc + '\'' +
                '}';
    }
}
