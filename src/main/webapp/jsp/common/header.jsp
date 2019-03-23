<%@ page import="org.springframework.web.context.request.SessionScope" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-header">
    <div class="layui-logo">博客管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
        <li class="layui-nav-item"><a href="/allBlog/showAllBlog">首页</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">


        <li class="layui-nav-item">
            <%--在顶部直接通过获取session当中存入的user值显示--%>
            <p>欢迎您!<i>${user.userName}</i></p>
        </li>

        <li class="layui-nav-item">
            <div id="box">
                <form action="${ctx}/search/mySearch" method="post">
                    <input type="text" id="searchContent" class="searchContent">
                    <input type="submit" value="搜索" id="search" class="search">
                </form>
            </div>
        </li>

        <li class="layui-nav-item">
            <a href="/jsp/main/writeBlog.jsp">写博客</a>
        </li>

        <li class="layui-nav-item">
            <a href="">消息</a>

            <dl class="layui-nav-child">
                <dd><a href="${ctx}/message/myMsg/${user.userName}">我的评论</a></dd>
                <dd><a href="${ctx}/message/otherMsg/${user.userName}">收到评论</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">

            <a href="javascript:;">
                <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                个人中心
            </a>
            <dl class="layui-nav-child">
                <dd><a href="/jsp/main/basicInfo.jsp">基本资料</a></dd>
                <dd><a href="@{${ctx}/user/outLogin}">退出</a></dd>
            </dl>
        </li>

    </ul>
</div>

<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
        <ul class="layui-nav layui-nav-tree" lay-filter="test">

            <%--分类--%>
            <li class="layui-nav-item layui-nav-itemed">
                <a class="" href="javascript:;">分类</a>
                <dl class="layui-nav-child">
                    <dd><a href="/frontBlog/showFrontBlog">前端</a></dd>
                    <dd><a href="/afterBlog/showAfterBlog">后端</a></dd>
                    <dd><a href="/otherBlog/showOtherBlog">其它</a></dd>
                </dl>
            </li>

            <%--登录--%>
            <li class="layui-nav-item"><a href="/jsp/main/login.jsp">登录</a></li>

            <%--注册--%>
            <li class="layui-nav-item"><a href="/jsp/main/register.jsp">注册</a></li>

            <%--后台管理--%>
            <li class="layui-nav-item"><a href="/jsp/main/background.jsp">后台管理</a></li>


        </ul>
    </div>
</div>
