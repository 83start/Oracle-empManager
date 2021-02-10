<%--
  Created by IntelliJ IDEA.
  User: CJ
  Date: 2020/12/24
  Time: 7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.manager.emp.entity.Emp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Emp emp = (Emp) request.getAttribute("emp");// 验证用户是否登录
    String eno = emp.getEmpno() + " ";
    String ename = emp.getEname();

%>
<form action="selectOneEmp" method="post">
    编号：<input type="text" id="empNo" value="<%=eno%>" name="empNo"> <br>
    姓名：<input type="text" id="empName" value="<%=ename%>" name="empName"> <br>
    <input type="submit" value="查询一个人">
</form>

<form action="selectAllEmp" method="post">
    <input type="submit" value="查询所有人">
</form>

</body>
</html>
