<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String contextPath = request.getContextPath(); %>
<link rel="stylesheet" type="text/css"	href="<%=contextPath%>/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"	href="<%=contextPath%>/css/css.css" />

<div class="contentwrap">
	<article class="container">
		<div class="page-header">
			<h1>회원가입</h1>
		</div>
		<form class="form-horizontal">
			<div class="form-group">
				<label for="inputEmail" class="col-sm-2 control-label">아이디</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="inputEmail" name="userid"
						placeholder="아이디를 입력하세요">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="inputPassword" name="passwd"
						placeholder="비밀번호">
					<p class="help-block">숫자, 특수문자 포함 5자 이상</p>
				</div>
			</div>
			<div class="form-group">
				<label for="inputPasswordCheck" class="col-sm-2 control-label">비밀번호확인</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="inputPasswordCheck" name="passwd2"
						placeholder="비밀번호 확인">
					<p class="help-block">비밀번호를 한번 더 입력하세요</p>
				</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" id="inputName" name="username"
						placeholder="이름을 입력하세요">
				</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label"></label>
				<div class="col-sm-6">
					<button type="submit" class="btn btn-primary">회원가입</button>
				</div>
			</div>
		</form>
	</article>
</div>