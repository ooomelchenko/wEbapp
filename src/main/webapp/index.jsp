<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@ page session="true" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="content"/>

<link href="css/generalStyle.css" rel="stylesheet" type="text/css">
<style>
    body{
        background: url(icons/game_room.jpg);
        background-size: 100%;
    }
</style>
<html lang="${param.lang}">
<head>
    <title>index</title>
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
<div style="width: 100%; text-align: center; font-size: xx-large">
    <a href="servlet"><fmt:message key="a.move.gameRoom" /><img src="icons/play.png" style="width: 50px; height: 50px"></a>
</div>

    <footer>
    </footer>

    </body>
</html>
