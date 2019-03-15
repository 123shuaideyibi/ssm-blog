<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>我的博客</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">我的博客列表页面</div>

        <table border="1">
            <thead>
            <tr>
                <th>文章id</th>
                <th>作者id</th>
                <th>文章标题</th>
                <th>文章简介</th>
                <th>文章标签</th>
                <th>文章内容</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${myBlog}" var="obj">
                <tr>
                    <td>${obj.articleId}</td>
                    <td>${obj.userId}</td>
                    <td>${obj.articleTitle}</td>
                    <td>${obj.articleDesc}</td>
                    <td>${obj.articleSort}</td>
                    <td>${obj.articleContent}</td>
                    <td>
                        <%--rest风格查询--%>
                        <a href="${ctx}/viewBlog/showMyBlog">查看文章</a>
                        <%--<a href="${ctx}/.../${obj.articleId}">删除</a>--%>
                    </td>
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
    layui.use('element', function () {
        var element = layui.element;

    });

</script>
</body>
</html>
