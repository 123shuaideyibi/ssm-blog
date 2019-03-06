<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-header">
    <div class="layui-logo">博客管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
        <li class="layui-nav-item"><a href="">首页</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">


        <li class="layui-nav-item">
            <div id="box">
                <input type="text" class="aa">
                <input type="button" value="搜索" class="bb">
            </div>
        </li>

        <li class="layui-nav-item">
            <a href="">写博客</a>
        </li>

        <li class="layui-nav-item">
            <a href="">消息</a>

            <dl class="layui-nav-child">
                <dd><a href="">评论</a></dd>
                <dd><a href="">关注</a></dd>
                <dd><a href="">点赞</a></dd>
                <dd><a href="">回答</a></dd>
                <dd><a href="">系统通知</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">

            <a href="javascript:;">
                <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                个人中心
            </a>
            <dl class="layui-nav-child">
                <dd><a href="/jsp/blogApp/information.jsp">基本资料</a></dd>
                <dd><a href="">我的关注</a></dd>
                <dd><a href="">我的收藏</a></dd>
                <dd><a href="">个人中心</a></dd>
                <dd><a href="">账户设置</a></dd>
                <hr/>
                <dd><a href="">我的博客</a></dd>
                <dd><a href="">管理博客</a></dd>
                <hr/>
                <dd><a href="">退出</a></dd>
            </dl>
        </li>

    </ul>
</div>

<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
        <ul class="layui-nav layui-nav-tree"  lay-filter="test">
            <li class="layui-nav-item layui-nav-itemed">
                <a class="" href="javascript:;">分类</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">推荐</a></dd>
                    <dd><a href="javascript:;">前端</a></dd>
                    <dd><a href="javascript:;">后端</a></dd>
                    <dd><a href="javascript:;">数据库</a></dd>
                    <dd><a href="javascript:;">编程语言</a></dd>
                    <dd><a href="javascript:;">游戏开发</a></dd>
                    <dd><a href="javascript:;">移动开发</a></dd>
                    <dd><a href="javascript:;">其它</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="/jsp/blogApp/login.jsp">登录</a></li>
            <li class="layui-nav-item"><a href="/jsp/blogApp/register.jsp">注册</a></li>
            <li class="layui-nav-item"><a href="">后台管理</a></li>
        </ul>
    </div>
</div>
