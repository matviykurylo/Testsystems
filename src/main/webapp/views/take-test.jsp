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
    <title>Тестування</title>
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
                <div class="test-nav">
                    <div class="test-name">Назва тесту</div>
                    <ul>
                        <li class="is-ready">
                            <a href="#">Запитання 1</a>
                        </li>
                        <li class="is-ready">
                            <a href="#">Запитання 2</a>
                        </li>
                        <li>
                            <a href="#">Запитання 3</a>
                        </li>
                        <li>
                            <a href="#">Запитання 4</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-lg-8">
            <div class="content-wrapper">
                <div class="create-test-wrap">
                    <div class="form-group question-title">
                        <label>Квадратний корінь з 9 ?</label>
                    </div>
                    <div class="form-group answers-wrap">
                        <label>Варіанти відповідей:</label>
                        <div class="form-group answer-field">
                            <input type="checkbox">
                            <input type="text" value="2" class="form-control">
                        </div>
                        <div class="form-group answer-field">
                            <input type="checkbox">
                            <input type="text" value="5" class="form-control">
                        </div>
                        <div class="form-group answer-field">
                            <input type="checkbox">
                            <input type="text" value="8" class="form-control">
                        </div>
                        <div class="form-group">
                            <button class="btn btn-success">Зберегти</button>
                            <button class="btn btn-active"> Попереднє питання</button>
                            <button class="btn btn-active">Наступне питання ></button>
                        </div>
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
