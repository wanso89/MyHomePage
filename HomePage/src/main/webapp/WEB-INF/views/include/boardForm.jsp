<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/css.css'/>" />


<div class="container">
	<div class="page-header">
		<h1>게시판</h1>
	</div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${boardList}" var="boardList">
			<tr>
				<td>${boardList.num}</td>
				<td><a href="/dddd/loginAfter/boardRetrieve?num=${boardList.num}">${boardList.title}</a></td>
				<td>${boardList.author}</td>
				<td>${boardList.writeday}</td>
				<td>${boardList.readCnt}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-default pull-right" href="<c:url value='/loginAfter/boardWriteUI'/>" role="button">글쓰기</a>
</div>