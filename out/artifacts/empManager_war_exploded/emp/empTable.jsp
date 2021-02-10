<%@ page import="java.util.List" %>
<%@ page import="com.manager.emp.entity.Emp" %>
<%--
  Created by IntelliJ IDEA.
  User: CJ
  Date: 2020/12/24
  Time: 7:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List emps = (List) request.getAttribute("emps");
%>
<table border="1">
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工工资</th>
    </tr>
    <%
        for (int i = 0; i < emps.size(); i++) {
            Emp emp = (Emp) emps.get(i);
    %>
    <tr>
        <th>
            <%=emp.getEmpno()%>
        </th>
        <th>
            <%=emp.getEname()%>
        </th>
        <th>
            <%=emp.getSal()%>
        </th>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
