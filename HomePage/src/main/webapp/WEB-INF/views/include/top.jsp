<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% String contextPath=request.getContextPath(); %>
<link rel="stylesheet" type="text/css" href="<%=contextPath%>/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="<%=contextPath%>/css/css.css"/>


    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="indexPage">웹개발 연습용 홈페이지</a>
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
                        <a href="aboutMe">About Me</a>
                    </li>
                    </c:if>
                    
                    <c:if test="${empty login}">
                    <li class="page-scroll">
                        <a href="loginForm">로그인</a>
                    </li>
                    </c:if>
                    <c:if test="${!empty login}">
                    <li class="page-scroll">
                        <a href="logout">로그아웃</a>
                    </li>
                    </c:if>
                    <li class="page-scroll">
                        <a href="loginAfter/boardForm">게시판</a>
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