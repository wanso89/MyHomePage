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
	
	<form class="form-inline pull-right" action="<c:url value='boardForm'/>" method="post">
  		<div class="form-group">
  	 		<select class="form-control" name="searchName" style="width:100px;height:35px;">
					  <option value="author">작성자</option>
					  <option value="title">제   목</option>
			</select>		
 		 </div>
 			 <div class="form-group mx-sm-3">
			    <label for="inputPassword2" class="sr-only">Password</label>
			    <input type="text" class="form-control" name="searchValue" id="inputPassword2" placeholder="내용 입력">
			 </div>
 				 <button type="submit" class="btn btn-warning">검색</button>
	</form>
	
	
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
			<c:set var="pageDTO" value="${pDTO}"></c:set>
			<c:forEach items="${pageDTO.boardList}" var="boardList">
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
	<jsp:include page="page.jsp" flush="true" />
</div>