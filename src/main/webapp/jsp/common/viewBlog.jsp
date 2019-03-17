<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录页面</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>


    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">登录页面</div>
        打开全部博客、前端、后端、数据库、其它都在这里面展示


        发表评论
        <div>
            <div>
                <input type="text" id="commentContent" name="commentContent" placeholder="请输入评论内容"
                       class="layui-input">
            </div>
            <div>
                <input type="button" value="确认发送">
            </div>
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
