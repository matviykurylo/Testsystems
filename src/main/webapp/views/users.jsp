<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 05.05.2017
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Користувач</title>
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
                <div class="title" onclick="window.location.assign('/')"><sec:authentication property="name"/></div>
                <div class="title">Меню</div>
                <div class="list-group">
                    <a href="/logout" class="list-group-item">Вийти</a>
                    <a href="/users" class="list-group-item active">Користувачі</a>
                    <a href="/tests/all" class="list-group-item">Тести</a>
                    <sec:authorize access="hasAnyAuthority('USER', 'ADMIN')"> <a href="results.jsp"
                                                                                 class="list-group-item">Результати</a>
                    </sec:authorize>
                </div>
            </div>
        </div>
        <div class="col-lg-8">
            <div class="content-wrapper">
                <sec:authorize access="hasAuthority('ADMIN')">
                    <div class="add-user">
                        <label>Новий користувач</label>
                        <form action="/users/add" method="post">
                            <div class="user-info">
                                <input type="text" name="surName" placeholder="Прізвище" class="form-control">
                                <input type="text" name="name" placeholder="Ім'я" class="form-control">
                                <input type="text" name="fName" placeholder="По-батькові" class="form-control">
                                <input type="email" name="email" placeholder="Email" class="form-control">
                                <input type="password" name="password" placeholder="Пароль" class="form-control">
                            </div>
                            <div class="user-permission">
                                <label>Роль користувача</label>
                                <select class="form-control" name="role" id="role">
                                    <option value="USER">СТУДЕНТ</option>
                                    <option value="TEACHER">ВИКЛАДАЧ</option>
                                    <option value="ADMIN">АДМІНІСТРАТОР</option>
                                </select>
                                <button class="btn btn-success" type="submit">Додати</button>
                            </div>
                        </form>
                    </div>
                    <hr>
                </sec:authorize>
                <div class="users-list">
                    <label>Список користувачів</label>
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>ПІБ</th>
                            <th>Email</th>
                            <th>Роль</th>
                            <sec:authorize access="hasAuthority('ADMIN')">
                                <th>Редагувати</th>
                                <th>Видалити</th>
                            </sec:authorize>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Курило Матвій Юрійович</td>
                            <td>kurylom98@gmail.com</td>
                            <td>Адміністратор</td>
                            <sec:authorize access="hasAuthority('ADMIN')">
                                <td>
                                    <a href="/users/edit/${user.id}" class="btn btn-warning">Редагувати</a>
                                </td>
                                <td>
                                    <button class="btn btn-danger">Видалити</button>
                                </td>
                            </sec:authorize>
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
