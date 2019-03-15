<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户列表页面</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">用户列表页面</div>

        <table border="1">
            <thead>
            <tr>
                <th>用户id</th>
                <th>用户名</th>
                <th>用户密码</th>
                <th>用户手机号</th>
                <th>用户邮箱</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="obj">
                <tr>
                    <td>${obj.userId}</td>
                    <td>${obj.userName}</td>
                    <td>${obj.userPassword}</td>
                    <td>${obj.userPhone}</td>
                    <td>${obj.userEmail}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>
