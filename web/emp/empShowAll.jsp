<%--
  Created by IntelliJ IDEA.
  User: CJ
  Date: 2020/12/23
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.manager.emp.entity.Emp" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=request.getContextPath()%>/">
    <title>Title</title>

    <script>
        function checkEmpNo() {
            var empNo = document.querySelector("#empNo").value.trim();
            // isNaN()函数 把空串 空格 以及NUll 按照0来处理 所以先去除，

            if(empNo === "" || empNo ==null){
                return false;
                alert("输入错误")
            }
            if(!isNaN(empNo)){
                return true;
            }
            else{
                return false;
                alert("输入错误")
            }
        }
    </script>

    <style>
        #empName{
            border: none;
        }
    </style>
</head>
<body>

<form action="selectOneEmp" method="post" onsubmit="checkEmpNo()">
    编号：<input type="text" id="empNo" value="" name="empNo"> <br>
    姓名：<input type="text" id="empName" value="" name="empName" readonly> <br>
    <input type="submit" value="查询一个人">
</form>

<form action="selectAllEmp" method="post">
    <input type="submit" value="查询所有人">
</form>

</body>
</html>
