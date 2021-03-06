<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/bootstrap.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/css.css'/>" />


    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header page-scroll">
                <a class="navbar-brand" href="/dddd/indexPage">웹개발 연습용 홈페이지</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <c:if test="${empty login}">
                    <li class="page-scroll">
                        <a href="joinForm">회원가입</a>
                    </li>
                    </c:if>
                    
                    <c:if test="${!empty login}">
                    <li class="page-scroll">
                        <a href="<c:url value='/loginAfter/aboutMe'/>">About Me</a>
                    </li>
                    </c:if>
                    
                    <c:if test="${empty login}">
                    <li class="page-scroll">
                        <a href="loginForm">로그인</a>
                    </li>
                    </c:if>
                    <c:if test="${!empty login}">
                    <li class="page-scroll">
                        <a href="<c:url value='/loginAfter/logout'/>">로그아웃</a>
                    </li>
                    </c:if>
                    <li class="page-scroll">
                        <a href="<c:url value='/loginAfter/boardForm'/>">게시판</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>


<div class="container">
	<div class="jumbotron">
		<h1 class="text-center">웹개발 연습용 홈페이지</h1>
	</div>
</div>