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

<form action="selectOneEmp" method="post">
    编号：<input type="text" id="empNo" value="查无此人" name="empNo"> <br>
    姓名：<input type="text" id="empName" value="查无此人" name="empName"> <br>
    <input type="submit" value="查询一个人">
</form>

<form action="selectAllEmp" method="post">
    <input type="submit" value="查询所有人">
</form>

</body>
</html>
