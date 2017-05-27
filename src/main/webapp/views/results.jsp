<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 05.05.2017
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Результати</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<header>
    <div class="container">
        <div class="title">Технічний коледж</div>
        <div class="sub-title">Онлайн тестування</div>
    </div>
</header>
<main>
    <div class="container">
        <div class="col-lg-4">
            <div class="user-nav-wrap">
                <div class="title">Меню</div>
                <div class="list-group">
                    <a href="/users" class="list-group-item">Користувачі</a>
                    <a href="/tests/all" class="list-group-item">Тести</a>
                    <sec:authorize access="hasAnyAuthority('USER', 'ADMIN')"> <a href="results.jsp"
                                                                                 class="list-group-item">Результати</a>
                    </sec:authorize>
                </div>
            </div>
        </div>
        <div class="col-lg-8">
            <div class="content-wrapper">
                <div class="users-list">
                    <label>Результати проходження тестів</label>
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>ПІБ</th>
                            <th>Назва тесту</th>
                            <th>Результат</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <sec:authorize access="hasAnyAuthority('TEACHER','ADMIN')">
                                <td>Jogn Doe</td>
                            </sec:authorize>
                            <td>Англійська</td>
                            <td>8/8</td>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</main>
<footer>
    <div class="copyright">2017 © Copyright. All rights reserved.</div>
</footer>


<script src="/resources/js/jquery-2.1.4.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/main.js"></script>
</body>
</html>
