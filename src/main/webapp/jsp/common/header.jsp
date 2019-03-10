<%@ page import="org.springframework.web.context.request.SessionScope" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-header">
    <div class="layui-logo">博客管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
        <li class="layui-nav-item"><a href="/jsp/main/headPage.jsp">首页</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">


        <li class="layui-nav-item">
            <%--在顶部直接通过获取session当中存入的user值显示--%>
            <p>欢迎您!<i>${user.userName}</i></p>
        </li>

        <li class="layui-nav-item">
            <div id="box">
                <input type="text" class="aa">
                <input type="button" value="搜索" class="bb">
            </div>
        </li>

        <li class="layui-nav-item">
            <a href="/jsp/main/writeBlog.jsp">写博客</a>
        </li>

        <li class="layui-nav-item">
            <a href="">消息</a>

            <dl class="layui-nav-child">
                <dd><a href="/jsp/main/comment.jsp">评论</a></dd>
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
            <li class="layui-nav-item layui-nav-itemed">
                <a class="" href="javascript:;">分类</a>
                <dl class="layui-nav-child">
                    <dd><a href="/jsp/main/sort/whole.jsp">全部</a></dd>
                    <dd><a href="/jsp/main/sort/attention.jsp">关注</a></dd>
                    <dd><a href="/jsp/main/sort/font.jsp">前端</a></dd>
                    <dd><a href="/jsp/main/sort/after.jsp">后端</a></dd>
                    <dd><a href="/jsp/main/sort/database.jsp">数据库</a></dd>
                    <dd><a href="/jsp/main/sort/program.jsp">编程语言</a></dd>
                    <dd><a href="/jsp/main/sort/others.jsp">其它</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="/jsp/main/login.jsp">登录</a></li>
            <li class="layui-nav-item"><a href="/jsp/main/register.jsp">注册</a></li>
            <li class="layui-nav-item"><a href="/jsp/main/background.jsp">后台管理</a></li>
        </ul>
    </div>
</div>
