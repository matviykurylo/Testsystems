<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: home
  Date: 05.05.2017
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Додати новий тест</title>
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
                   <sf:form action="/tests/add/question" method="post">
                    <div class="form-group question-title">
                        <label>Заголовок запитання:</label>
                        <input type="text" name="text" class="form-control" placeholder="Введіть запитання">
                    </div>


                    <%--<div class="form-group question-content">--%>
                        <%--<div class="question-type">--%>
                            <%--<label>Тип запитання:</label>--%>
                            <%--<select class="form-control">--%>
                                <%--<option>Одна відповідь</option>--%>
                                <%--<option>Кілька відповідей</option>--%>
                                <%--<option>Ввід</option>--%>

                            <%--</select>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="form-group answers-wrap"> <!-- Тип: Одна відповідь -->--%>
                        <%--<label>Відповіді:</label>--%>
                        <%--<div class="form-group answer-field">--%>
                            <%--<input type="radio" name="isTrue">--%>
                            <%--<input type="text" placeholder="Варіант відповіді" class="form-control">--%>
                            <%--<button class="btn btn-danger">Видалити</button>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-field">--%>
                            <%--<input type="radio" name="isTrue">--%>
                            <%--<input type="text" placeholder="Варіант відповіді" class="form-control">--%>
                            <%--<button class="btn btn-danger">Видалити</button>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-field">--%>
                            <%--<input type="radio" name="isTrue">--%>
                            <%--<input type="text" placeholder="Варіант відповіді" class="form-control">--%>
                            <%--<button class="btn btn-danger">Видалити</button>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-field">--%>
                            <%--<input type="radio" name="isTrue">--%>
                            <%--<input type="text" placeholder="Варіант відповіді" class="form-control">--%>
                            <%--<button class="btn btn-danger">Видалити</button>--%>
                        <%--</div>--%>

                        <%--<div class="form-group answer-field add-new-answer">--%>
                            <%--<input type="text" class="form-control">--%>
                            <%--<button class="btn btn-success">Додати відповідь</button>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-weight">--%>
                            <%--<label>Вага питання:</label>--%>
                            <%--<select class="form-control" name="price">--%>
                              <%--<c:forEach items="${questions}" var="questions">--%>
                                <%--<option value=1>1</option>--%>
                                <%--<option value=2>2</option>--%>
                                <%--<option value=3>3</option>--%>
                                <%--<option value=4>4</option>--%>
                                <%--<option value=5>5</option>--%>
                              <%--</c:forEach>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<button type="submit" class="btn btn-success">Зберегти</button>--%>
                            <%--<button class="btn btn-active"> Попереднє питання</button>--%>
                            <%--<button class="btn btn-active">Наступне питання ></button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<hr>--%>
                   <%--</form>--%>

                    <div class="form-group answers-wrap"> <!-- Тип: Кілька відповідей -->
                        <label>Відповіді:</label>
                        <div class="form-group answer-field">
                            <input type="checkbox" name="isTrue">
                            <input type="text" name="answer" placeholder="Варіант відповіді" class="form-control">
                            <button class="btn btn-danger">Видалити</button>
                        </div>
                        <div class="form-group answer-field">
                            <input type="checkbox" name="isTrue">
                            <input type="text" name="answer" placeholder="Варіант відповіді" class="form-control">
                            <button class="btn btn-danger">Видалити</button>
                        </div>
                        <div class="form-group answer-field">
                            <input type="checkbox" name="isTrue">
                            <input type="text" name="answer" placeholder="Варіант відповіді" class="form-control">
                            <button class="btn btn-danger">Видалити</button>
                        </div>
                        <div class="form-group answer-field">
                            <input type="checkbox" name="isTrue">
                            <input type="text" name="answer" placeholder="Варіант відповіді" class="form-control">
                            <button class="btn btn-danger">Видалити</button>
                        </div>

                        <div class="form-group answer-field add-new-answer">
                            <input type="text" class="form-control">
                            <button class="btn btn-success">Додати відповідь</button>
                        </div>
                        <div class="form-group answer-weight">
                            <label>Вага питання:</label>
                            <%--<select class="form-control" name="">--%>
                                <%--<option value="1">1</option>--%>
                                <%--<option value="2">2</option>--%>
                                <%--<option value="3">3</option>--%>
                                <%--<option value="4">4</option>--%>
                                <%--<option value="5">5</option>--%>
                            <%--</select>--%>

                            <select class="form-control" id = "price" name="price">
                                <option value=1>1</option>
                                <option value=2>2</option>
                                <option value=3>3</option>
                                <option value=4>4</option>
                                <option value=5>5</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-success" type="submit">Зберегти</button>
                            <button class="btn btn-active"> Попереднє питання</button>
                            <button class="btn btn-active">Наступне питання ></button>
                        </div>
                    </div>
                   </sf:form>

                    <%--<div class="form-group answers-wrap"> <!-- Тип: Конкретна відповідь -->--%>
                        <%--<label>Відповідь:</label>--%>
                        <%--<div class="form-group">--%>
                            <%--<input type="checkbox" id="registr" name="registr">--%>
                            <%--<label for="registr">Враховувати регістр</label>--%>
                            <%--<div class="answer-field one-answer">--%>
                                <%--<input type="text" placeholder="відповідь" class="form-control">--%>
                                <%--<button class="btn btn-danger">Видалити</button>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-weight">--%>
                            <%--<label>Вага питання:</label>--%>
                            <%--<select class="form-control">--%>
                                <%--<option>1</option>--%>
                                <%--<option>2</option>--%>
                                <%--<option>3</option>--%>
                                <%--<option>4</option>--%>
                                <%--<option>5</option>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<button class="btn btn-success">Зберегти</button>--%>
                            <%--<button class="btn btn-active">Попереднє питання</button>--%>
                            <%--<button class="btn btn-active">Наступне питання ></button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<hr>--%>

                    <%--<div class="form-group answers-wrap"> <!-- Тип: Співвідношення -->--%>
                        <%--<div class="form-group">--%>
                            <%--<label>Відповідь:</label>--%>
                            <%--<table class="table table-bordered">--%>
                                <%--<tbody>--%>
                                <%--<tr>--%>
                                    <%--<td>Стрий</td>--%>
                                    <%--<td>Львівська</td>--%>
                                <%--</tr>--%>
                                <%--<tr>--%>
                                    <%--<td>Бровари</td>--%>
                                    <%--<td>Київська</td>--%>
                                <%--</tr>--%>
                                <%--<tr>--%>
                                    <%--<td>Жмеринка</td>--%>
                                    <%--<td>Вінницька</td>--%>
                                <%--</tr>--%>
                                <%--<tr>--%>
                                    <%--<td>Бердичів</td>--%>
                                    <%--<td>Житомирська</td>--%>
                                <%--</tr>--%>
                                <%--</tbody>--%>
                            <%--</table>--%>
                            <%--<button class="btn btn-success">Додати ряд</button>--%>
                        <%--</div>--%>
                        <%--<div class="form-group answer-weight">--%>
                            <%--<label>Вага питання:</label>--%>
                            <%--<select class="form-control">--%>
                                <%--<option>1</option>--%>
                                <%--<option>2</option>--%>
                                <%--<option>3</option>--%>
                                <%--<option>4</option>--%>
                                <%--<option>5</option>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                        <%--<div class="form-group">--%>
                            <%--<button class="btn btn-success">Зберегти</button>--%>
                            <%--<button class="btn btn-active"> Попереднє питання</button>--%>
                            <%--<button class="btn btn-active">Наступне питання ></button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
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
</body>
</html>
