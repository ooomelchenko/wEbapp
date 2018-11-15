<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@ page session="true" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="content"/>

<link href="css/generalStyle.css" rel="stylesheet" type="text/css">

<html lang="${sessionScope.lang}">
<head>
    <title><fmt:message key="content.gameRoom"/></title>
</head>

<header>
    <div id="div_menu" style="width: 30%">
    </div>
    <div style="width: 40%">
        <h1>
            <fmt:message key="content.gameRoom"/>
        </h1>
    </div>
    <div class="div_lang" style=" width: 30%">
        <a href="?command=gameroom&sessionLocale=en"><img src="icons/gb.png"><fmt:message key="lang.en"/></a>
        <br/>
        <a href="?command=gameroom&sessionLocale=ua"><img src="icons/ua.png"><fmt:message key="lang.ua"/></a>
    </div>
</header>
<div id="div_body">
    <div id="div_filters" style="width: 20%">
        <h2><fmt:message key="content.filter"/><img src="icons/filter.png" style="width: 20px; height: 20px"></h2>

        <form method="get" style="width: 95%">
            <input type="hidden" name="command" value="filtertoys" />
            <input name="minPrice" placeholder="<fmt:message key="content.price.min"/>" title="<fmt:message key="content.price.min"/>" type="number" style="width: 50%"><input name="maxPrice" placeholder="<fmt:message key="content.price.max"/>" title="<fmt:message key="content.price.max"/>" type="number" style="width: 50%">
            <select style="width: 100%" name="ChildMale">
                <option selected="selected">
                    ALL
                </option>
                <c:forEach var="male" items="${sessionScope.ChildMale}">
                    <option value="${male}">
                        <c:out value="${male}"/>
                    </option>
                </c:forEach>
            </select>
            <select style="width: 100%" name="AgeGroup">
                <option selected="selected">
                    ALL
                </option>
                <c:forEach var="age" items="${sessionScope.AgeGroup}">
                    <option value="${age}">
                        <c:out value="${age}"/>
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="OK">
        </form>

    </div>
    <div id="div_allToys" style="width: 80%">
        <table>
            <tr>
                <th>ID</th>
                <th><fmt:message key="table.head.name"/></th>
                <th><fmt:message key="table.head.price"/>
                    <a href="?command=sortbyprice" title="сортувати за ціною">
                        <img src="icons/sort.png" style="width: 12px; height: 12px">
                    </a>
                </th>
                <th><fmt:message key="table.head.ageGroup"/></th>
                <th><fmt:message key="table.head.maleGroup"/></th>
            </tr>
            <c:forEach var="toy" items="${sessionScope.toyList}">
                <tr>
                    <td><c:out value="${toy.id} "/></td>
                    <td><c:out value="${toy.name} "/></td>
                    <td><c:out value="${toy.priceUSD} "/></td>
                    <td><c:out value="${toy.ageGroup} "/></td>
                    <td><c:out value="${toy.childMale} "/></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</div>


<%--<div id="div_toys">
    <div >
        <table>
            <tr>
                <th>ID</th>
                <th><fmt:message key="table.head.name"/></th>
                <th><fmt:message key="table.head.price"/></th>
                <th><fmt:message key="table.head.ageGroup"/></th>
                <th><fmt:message key="table.head.maleGroup"/></th>
            </tr>
            <c:forEach var="toy" items="${sessionScope.toyList}">
                <tr>
                    <td><c:out value="${toy.id} " /></td>
                    <td><c:out value="${toy.name} " /></td>
                    <td><c:out value="${toy.priceUSD} " /></td>
                    <td><c:out value="${toy.ageGroup} " /></td>
                    <td><c:out value="${toy.childMale} " /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div >
        <table>
            <tr>
                <th>ID</th>
                <th><fmt:message key="table.head.name"/></th>
                <th><fmt:message key="table.head.price"/></th>
                <th><fmt:message key="table.head.ageGroup"/></th>
                <th><fmt:message key="table.head.maleGroup"/></th>
            </tr>
            <c:forEach var="toy" items="${sessionScope.toyList}">
                <tr>
                    <td><c:out value="${toy.id} " /></td>
                    <td><c:out value="${toy.name} " /></td>
                    <td><c:out value="${toy.priceUSD} " /></td>
                    <td><c:out value="${toy.ageGroup} " /></td>
                    <td><c:out value="${toy.childMale} " /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div>
        <table>
            <tr>
                <th>ID</th>
                <th><fmt:message key="table.head.name"/></th>
                <th><fmt:message key="table.head.price"/></th>
                <th><fmt:message key="table.head.ageGroup"/></th>
                <th><fmt:message key="table.head.maleGroup"/></th>
            </tr>
            <c:forEach var="toy" items="${sessionScope.toyList}">
                <tr>
                    <td><c:out value="${toy.id} " /></td>
                    <td><c:out value="${toy.name} " /></td>
                    <td><c:out value="${toy.priceUSD} " /></td>
                    <td><c:out value="${toy.ageGroup} " /></td>
                    <td><c:out value="${toy.childMale} " /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div>
        <table>
            <tr>
                <th>ID</th>
                <th><fmt:message key="table.head.name"/></th>
                <th><fmt:message key="table.head.price"/></th>
                <th><fmt:message key="table.head.ageGroup"/></th>
                <th><fmt:message key="table.head.maleGroup"/></th>
            </tr>
            <c:forEach var="toy" items="${sessionScope.toyList}">
                <tr>
                    <td><c:out value="${toy.id} " /></td>
                    <td><c:out value="${toy.name} " /></td>
                    <td><c:out value="${toy.priceUSD} " /></td>
                    <td><c:out value="${toy.ageGroup} " /></td>
                    <td><c:out value="${toy.childMale} " /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>--%>

</body>
</html>
