<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录页面</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
    <link rel="stylesheet" href="${ctx}/css/basicInfo.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">基础资料</div>

        session中的值：${user}

        <div>
            <table border="1" align="center">
                <caption>
                    用户详细信息
                </caption>
                <tr>
                    <th>用户名：</th>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <th>电话：</th>
                    <td>${user.userPhone}</td>
                </tr>
                <tr>
                    <th>手机邮箱：</th>
                    <td>${user.userEmail}</td>
                </tr>
            </table>
        </div>
        <div class="box">
            <button id="modifyInfo">修改信息</button>
        </div>

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
