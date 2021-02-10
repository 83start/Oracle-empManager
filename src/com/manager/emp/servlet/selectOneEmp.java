package com.manager.emp.servlet;

import com.manager.emp.dao.EmpDao;
import com.manager.emp.entity.Emp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 83start
 * @create 2020-12-23
 */

public class SelectOneEmp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empNo = Integer.parseInt(request.getParameter("empNo"));
        Emp emp = new EmpDao().selectOneEmp(empNo);
        response.setContentType("text/html;charset=UTF-8"); // 设置响应的编码方式
        request.setAttribute("emp",emp);
        //跳转页面
        request.getRequestDispatcher("/emp/empShowAll.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }


}


