<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 08.11.16
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <c:if test="${userAuth == 'true'}">
    <a href="/user">Личный кабинет</a>
  </c:if>
  <c:if test="${userAuth == 'false'}">
    <a href="/login">Войти</a>
  </c:if>
  </body>
</html>
