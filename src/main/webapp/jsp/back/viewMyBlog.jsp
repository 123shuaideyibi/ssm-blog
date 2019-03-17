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
        <div style="padding: 15px;">阅读博客页面</div>
        <c:forEach items="${myBlog}" var="obj">


            <%--文章标题--%>
            <div>
                <label>标题：</label>
                <div>
                    <p type="text" id="articleTitle" name="articleTitle" class="layui-input">${obj.articleTitle}</p>
                </div>
            </div>

            <%--作者id--%>
            <div>
                <label>作者：</label>
                <p type="hidden" id="userId" name="userId" class="layui-input">${user.userName}</p>
            </div>

            <%--博客简介--%>
            <div>
                <label>简介：</label>
                <div>
                    <p type="text" id="articleDesc" name="articleDesc" class="layui-input">${obj.articleDesc}</p>
                </div>
            </div>

            <%--文章类型--%>
            <div>
                <label>文章类型：</label>
                <div>
                    <p type="text" id="articleSort" name="articleSort" class="layui-input">${obj.articleSort}</p>
                </div>
            </div>

            <%--文章内容--%>
            <div>
                <label>文本域：</label>
                <div>
                    <p id="articleContent" name="articleContent"
                       class="layui-textarea">${obj.articleContent}</p>
                </div>
            </div>
        </c:forEach>



        <%--发表评论--%>
        <%--<div>--%>
        <%--<div>--%>
        <%--<input type="text" id="commentContent" name="commentContent" placeholder="请输入评论内容"--%>
        <%--class="layui-input">--%>
        <%--</div>--%>
        <%--<div>--%>
        <%--<input type="button" value="确认发送">--%>
        <%--</div>--%>
        <%--</div>--%>


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
