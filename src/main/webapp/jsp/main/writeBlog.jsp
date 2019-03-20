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
        <div style="padding: 15px;">写博客页面</div>
        ${user}

        <form id="form" action="${ctx}/article/writeBlog" method="post">
            <%--作者id--%>
            <div>
                <input type="hidden" id="userId" name="userId" value="${user.userId}">
            </div>

            <%--文章标题--%>
            <div>
                <label>标题：</label>
                <div>
                    <input type="text" id="articleTitle" name="articleTitle" placeholder="请输入标题"
                           class="layui-input">
                </div>
            </div>

            <%--博客简介--%>
            <div>
                <label>简介：</label>
                <div>
                    <input type="text" id="articleDesc" name="articleDesc" placeholder="请输入博客简介"
                           class="layui-input">
                </div>
            </div>

            <%--文章类型--%>
            <div>
                <label>文章类型：</label>
                <div>
                    <select id="articleSort" name="articleSort" class="layui-input">
                        <option value="1" selected>前端</option>
                        <option value="2">后端</option>
                        <option value="3">其它</option>
                    </select>
                </div>
            </div>

            <%--文章内容--%>
            <div>
                <label>文本域：</label>
                <div>
                    <textarea id="articleContent" name="articleContent" placeholder="请输入内容"
                              class="layui-textarea"></textarea>
                </div>
            </div>

            <%--发表博客--%>
            <div>
                <div>
                    <input type="submit" value="上传博客">
                </div>
            </div>

        </form>

        <div id="result"></div>


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
