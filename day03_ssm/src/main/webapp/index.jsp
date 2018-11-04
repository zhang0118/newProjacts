<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/10/30
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">点击有惊喜</a>

        <form action="account/seve" method="post">
            名字:<input type="text" name="name" >
            工资:<input type="text" name="money">
            <input type="submit" value="添加用户">
        </form>

</body>
</html>
