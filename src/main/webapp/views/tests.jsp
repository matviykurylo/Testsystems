<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
    <title>Тести</title>
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
                    <%--<a href="/users/edit/${user.id}" class="list-group-item">Редагувати дані</a>--%>
                    <a href="/logout" class="list-group-item">Вийти</a>
                    <a href="/users" class="list-group-item">Користувачі</a>
                    <a href="/tests/all" class="list-group-item active">Тести</a>
                    <a href="results.jsp" class="list-group-item">Результати</a>
                </div>
            </div>
        </div>
        <div class="col-lg-8">
            <div class="content-wrapper">
               <form action="/tests/add" method="post">
                <div class="add-tests">
                    <label>Введіть назву тесту</label>
                    <input type="text" class="form-control" name="title" placeholder="Назва тесту">
                    <button type="submit" class="btn btn-success">Додати тест</button>
                </div>
                   </form>
                <table class="table table-bordered">
                    <thead>
                    <tr class="active">
                        <th>Назва</th>
                        <th>Кількість питань</th>
                        <th>Результати</th>
                        <th>Редагувати</th>
                        <th>Видалити</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Українська</td>
                        <td>8</td>
                        <td>  <%--Студент кнопочок бачити не буде--%>
                            <a href="results.jsp" class="btn btn-success">Результати</a>
                        </td>
                        <td>
                            <button class="btn btn-warning">Редагувати</button>
                        </td>
                        <td>
                            <button class="btn btn-danger">Видалити</button>
                        </td>
                    </tr>

                    </tbody>
                </table>
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
