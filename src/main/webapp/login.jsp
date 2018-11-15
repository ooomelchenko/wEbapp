<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@ page session="true" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="content"/>

<link href="css/generalStyle.css" rel="stylesheet" type="text/css">

<html>
<head>
    <head><title>Login</title></head>
</head>
<body>
<header>
    <div style="width: 20%">
    </div>
    <div style="width: 60%">
        <h1>
            <fmt:message key="data.hello"/>
        </h1>
    </div >
    <div class="div_lang" style=" width: 20%">
         <a href="?sessionLocale=en"><img src="icons/gb.png"><fmt:message key="lang.en" /></a>
         <br/>
         <a href="?sessionLocale=ua"><img src="icons/ua.png"><fmt:message key="lang.ua" /></a>
    </div>
</header>

<form name="loginForm" method="POST" action="servlet">
    <input type="hidden" name="command" value="login" />
    <fmt:message key="content.login"/>:<br/>
    <input type="text" name="login" value=""/>
    <br/><fmt:message key="content.password"/>:<br/>
    <input type="password" name="password" value=""/>
    <%-- <br/>
     ${errorLoginPassMessage}
     <br/>
     ${wrongAction}
     <br/>
     ${nullPage}
     <br/>--%>

    <input type="submit" value="<fmt:message key="content.button.log.in"/>"/>
</form><hr/>
</body>

</html>