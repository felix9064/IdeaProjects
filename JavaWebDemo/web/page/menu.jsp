<%--
  Created by IntelliJ IDEA.
  User: Felix
  Date: 2017/4/25
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="css/monitor_menu.css" rel="stylesheet" type="text/css" />
<div class="outer">
    <aside class="left-side sidebar-offcanvas">
        <section class="sidebar">
            <ul class="sidebar-menu">
                <li class="active" style="cursor: pointer;">
                    <a class="nav-header menu-first collapsed">
                        <i class="fa fa-dashboard" ></i> <span>监控面板</span>
                        <i id="lock" class="fa fa-lock pull-right"></i>
                    </a>
                </li>
                <li>
                    <a id="adminuser" href="page/userinfo.jsp" target="contentIframe" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>用户管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>交易监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>当天交易量监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>历史交易量监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>服务器健康检查</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>数据库表空间监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>数据库连接数监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>CPU监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>内存监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>流程交易监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-header menu-first collapsed">
                        <i class="fa fa-envelope"></i> <span>岗位交易监控</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
            </ul>
        </section>
    </aside>
</div>
