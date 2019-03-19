<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>全部博客查看页面</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <%--引入头部区域和侧部导航区域--%>
    <jsp:include page="/jsp/common/header.jsp"></jsp:include>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;"></div>
        ${frontBlog}

        <%--作者id--%>
        <div>
            <label>作者：</label>
            <div>
                <p type="hidden" id="userId1" name="userId" class="layui-input">${frontBlog.userName}</p>
            </div>
        </div>

        <%--文章标题--%>
        <div>
            <label>标题：</label>
            <div>
                <p type="text" id="articleTitle1" name="articleTitle" class="layui-input">${frontBlog.articleTitle}</p>
            </div>
        </div>


        <%--博客简介--%>
        <div>
            <label>简介：</label>
            <div>
                <p type="text" id="articleDesc1" name="articleDesc" class="layui-input">${frontBlog.articleDesc}</p>
            </div>
        </div>

        <%--文章类型--%>
        <div>
            <label>文章类型：</label>
            <div>
                <p type="text" id="articleSort1" name="articleSort" class="layui-input">${frontBlog.articleSort}</p>
            </div>
        </div>

        <%--文章内容--%>
        <div>
            <label>文本域：</label>
            <div>
                <p id="articleContent1" name="articleContent"
                   class="layui-textarea">${frontBlog.articleContent}</p>
            </div>
        </div>

        <div>
            <label>发表评论</label>
            <form action="${ctx}/comment/toComment" method="post">

                <%--文章的id--%>
                <input type="hidden" id="articleId" name="articleId" value="${frontBlog.articleId}">

                <%--博主--%>
                <input type="hidden" id="blogger" name="blogger" value="${frontBlog.userName}">

                <%--评论者--%>
                <input type="hidden" id="observer" name="observer" value="${user.userName}">

                <%--评论的内容--%>
                <input type="text" id="commentContent" name="commentContent" placeholder="请输入评论内容"
                       class="layui-input">

                <%--评论的发送--%>
                <input type="submit" value="确认发送">

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
</div>
</body>
</html>
