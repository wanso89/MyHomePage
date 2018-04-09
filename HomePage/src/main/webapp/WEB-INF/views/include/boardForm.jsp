<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String contextPath = request.getContextPath(); %>
<link rel="stylesheet" type="text/css"	href="<%=contextPath%>/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"	href="<%=contextPath%>/css/css.css" />


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
			<tr>
				<td>1</td>
				<td>하이</td>
				<td>관리자</td>
				<td>2018-04-09</td>
				<td>0</td>
			</tr>
		</tbody>
	</table>
	<a class="btn btn-default pull-right" href="#" role="button">글쓰기</a>
</div>