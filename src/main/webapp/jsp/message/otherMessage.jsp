<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>收到评论</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">收到评论</div>

        <table border="1">
            <thead>
            <tr>
                <th>文章id</th>
                <th>博主</th>
                <th>评论者</th>
                <th>评论内容</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${otherMsg}" var="obj">
                <tr>
                    <td>${obj.articleId}</td>
                    <td>${obj.blogger}</td>
                    <td>${obj.observer}</td>
                    <td>${obj.commentContent}</td>
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
