<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/bootstrap.css' />" />
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/css.css'/>" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="<c:url value='/js/memberCheck.js' />"></script>

<div class="contentwrap">
	<article class="container">
		<div class="page-header">
			<h1>회원가입</h1>
		</div>
		<form class="form-horizontal" name="memberForm" id="memberForm" method="post">
		<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="inputUserName" name="username"
						placeholder="이름을 입력하세요">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail" class="col-sm-2 control-label">아이디</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="inputUserId" name="userid"
						placeholder="아이디를 입력하세요">
				</div>
				<a class="btn btn-success" role="button" id="idCheck">중복체크</a>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="inputUserPassword" name="passwd"
						placeholder="비밀번호">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPasswordCheck" class="col-sm-2 control-label">비밀번호확인</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="inputUserPasswordCheck" name="passwd2"
						placeholder="비밀번호 확인">
					<p class="help-block" id="check"></p>
				</div>
			</div>
		</form>
		<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label"></label>
				<div class="col-sm-6">
					<input type="button" class="btn btn-warning" id="memberJoin" value="가입">
					<input type="button" class="btn btn-primary" id="memberJoinCancle" value="취소">
				</div>
		</div>
	</article>
</div>