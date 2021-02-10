package com.manager.emp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author 83start
 * @create 2020-12-23
 * @ emp 的实体类
 */
@Setter
@Getter
@NoArgsConstructor
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private double sal;
    private double comm;
    private int deptno;

    public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "emp{" +
                       "empno=" + empno +
                       ", ename='" + ename + '\'' +
                       ", job='" + job + '\'' +
                       ", mgr=" + mgr +
                       ", hiredate=" + hiredate +
                       ", sal=" + sal +
                       ", comm=" + comm +
                       ", deptno=" + deptno +
                       '}';
    }
}
