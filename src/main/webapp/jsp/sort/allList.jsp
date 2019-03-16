<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部博客</title>
</head>
<body>
${allArticle}

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
    <c:forEach items="${allArticle}" var="obj">
        <tr>
            <td>${obj.articleId}</td>
            <td>${obj.userId}</td>
            <td>${obj.articleTitle}</td>
            <td>${obj.articleDesc}</td>
            <td>${obj.articleSort}</td>
            <td>${obj.articleContent}</td>
            <td>
                <%--查看跳转--%>
                <a href="${ctx}/viewBlog/viewAllBlog/${obj.articleId}">查看文章</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
