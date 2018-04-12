<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/css.css'/>" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="<c:url value='/js/boardWriteCheck.js' />"></script>

<div class="contentwrap">
	<article class="container">
		<div class="page-header">
			<h1>게시판 - 글쓰기</h1>
		</div>
		<form class="form-horizontal" id="boardWriteForm">
		<div class="form-group">
			<label for="inputName" class="col-sm-2 control-label">제목</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="title" name="title"
				placeholder="제목을 입력하세요">
				<input type="hidden" name="author" value="${login.userid}">
				</div>
		</div>
		<div class="form-group">
			<label for="inputName" class="col-sm-2 control-label">내용</label>
			<div class="col-sm-6">
				<textarea class="form-control" rows="10" name="content" placeholder="내용을 입력하세요"></textarea>
				</div>
		</div>
		</form>
		<div class="form-group">
			<div class="col-sm-12">
				<button class="btn btn-default pull-right" id="boardCancel">취소</button>
				<button class="btn btn-warning pull-right" id="boardSave">저장</button>
			</div>
		</div>
	</article>
</div>