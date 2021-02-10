package com.manager.emp.dao;

import com.manager.emp.entity.Emp;
import com.manager.emp.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 83start
 * @create 2020-12-23
 * @
 */
public class EmpDao {
    // 数据库连接对象
    Connection connection;

    public EmpDao() {
        connection = new DBConnection().connection;
    }

    /**
     * 根据学号查询一个人的信息
     *
     * @param empNo
     * @return
     */
    public Emp selectOneEmp(int empNo) {
        Emp emp = null;
        String select = "SELECT * FROM emp WHERE empno = " + empNo;
        try {
            PreparedStatement pStmt = connection.prepareStatement(select);
            // 执行查询
            ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                emp = new Emp();
                emp.setEmpno(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSal(rs.getDouble(6));
                emp.setComm(rs.getDouble(7));
                emp.setDeptno(rs.getInt(8));
            }
            connection.close();
            pStmt.close();
            return emp;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询所有人的信息
     */
    public List<Emp> selectAllEmp() {
        List<Emp> empList = new ArrayList<>();// 创建新的List
        try {
            PreparedStatement pStmt = connection.prepareStatement("SELECT empno,ename,sal FROM emp");
            ResultSet rs = pStmt.executeQuery(); // 执行查询，返回结果集rs
            while (rs.next()){
                Emp emp = new Emp();
                emp.setEmpno(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setSal(rs.getDouble(3));
                empList.add(emp);
            }
            rs.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empList;
    }


}
