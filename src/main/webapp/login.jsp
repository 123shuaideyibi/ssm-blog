<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <%--<script type="text/javascript" charset="UTF-8" src="js/login.js"></script>--%>
    <script type="text/javascript" src="static/plugins/layui/layui.js"></script>
</head>
<body>


<form action="${ctx}/user/login" method="post">
    <table border="0" align="center">
        <caption>
            用户登录
        </caption>
        <tr>
            <th>用户名：</th>
            <td><input type="text" name="username" placeholder="请输入您的用户名"/></td>
        </tr>
        <tr>
            <th>密码：</th>
            <td><input type="password" name="password" placeholder="请输入您的用户名"/></td>
        </tr>
        <tr>
            <td align="center" colspan="3">
                <input type="submit" value="登录" onclick="toLogin()"/>
            </td>
        </tr>
    </table>
</form>

<script>
    layui.use('layer', function(){
        var layer = layui.layer;

        layer.msg('hello');
    });
</script>

</body>
</html>