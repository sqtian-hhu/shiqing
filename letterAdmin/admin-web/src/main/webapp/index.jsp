<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="admin/findAll">查询已有管理员</a>

<h3>注册新账户</h3>
<form action="admin/register" method="post">
    token：<input type="text" name="usertoken"/><br/>
    用户名: <input type="text" name="username"/><br/>
    密码: <input type="password" name="password"/><br/>
    <input type="submit" name="保存"/><br/>
</form>

</body>
</html>
