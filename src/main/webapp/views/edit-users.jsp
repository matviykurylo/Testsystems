<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="col-lg-offset-3 col-lg-6">
            <div class="login-register-wrap">
                <div>
                    <div role="tabpanel" class="tab-pane" id="register-tab">
                            <form action="/users/edit" method="post">
                                <div class="form-group">
                                    <label>Прізвище</label>
                                    <input class="form-control" name="surName" id="surName" type="text" placeholder="Прізвище">
                                </div>
                                <div class="form-group">
                                    <label>Ім'я</label>
                                    <input class="form-control" name="name" id="name" type="text" placeholder="Ім'я">
                                </div>
                                <div class="form-group">
                                    <label>По-батькові</label>
                                    <input class="form-control" name="fName" id="fName" type="text" placeholder="По-батькові">
                                </div>
                                <div class="form-group">
                                    <label>Email</label>
                                    <input class="form-control" name="email" id="email" type="email" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <label>Пароль</label>
                                    <input class="form-control" name="password" id="password" type="password" placeholder="Пароль">
                                </div>
                         <sec:authorize access="hasAuthority('ADMIN')">      <label>Роль користувача</label>
                                <select class="form-control" name="role" id="role">
                                   <option value="USER">СТУДЕНТ</option>
                                   <option value="TEACHER">ВИКЛАДАЧ</option>
                                   <option value="ADMIN">АДМІНІСТРАТОР</option>

                                </select>
                         </sec:authorize>

                                <div class="form-group">
                                    <button type="submit" class="btn btn-success">Редагувати</button>
                                </div>
                            </form>
                    </div>
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
