package com.manager.emp.servlet;

import com.manager.emp.dao.EmpDao;
import com.manager.emp.entity.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 83start
 * @create 2020-12-23
 */
public class SelectAllEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Emp> emps = new EmpDao().selectAllEmp();
        System.out.println(emps.size());
        for (Emp emp: emps) {
            System.out.println(emp);
        }
        request.setAttribute("emps",emps);
        request.getRequestDispatcher("/emp/empTable.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
