<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 24.10.16
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Авторизация</title>
  </head>
  <body>

  ${errorMessage}<br>
  <form action="/j_spring_security_check" method="POST">
    Login: <input type="text" name="j_username">
    <br/>
    Пароль: <input type="password" name="j_password" />
    <input type="submit" value="Войти" />
  </form>

  <a href="/reg">Регистрация</a>

  </body>
</html>
