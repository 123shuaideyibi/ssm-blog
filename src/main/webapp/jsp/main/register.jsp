<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>注册页面</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>


    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">注册页面</div>
        ${user}

        <form action="${ctx}/user/register" method="post">
            <table border="0" align="center">
                <caption>
                    用户注册
                </caption>
                <tr>
                    <th>用户名：</th>
                    <td><input type="text" name="userName" id="userName" placeholder="请输入您的用户名"/></td>
                </tr>
                <tr>
                    <th>密码：</th>
                    <td><input type="password" name="userPassword" id="userPassword" placeholder="请输入您的密码"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="3">
                        <input type="submit" value="注册"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</body>
</html>
