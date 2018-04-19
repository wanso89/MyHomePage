<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/css.css'/>" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="<c:url value='/js/boardUpdate.js' />"></script>
<script src="<c:url value='/js/boardDelete.js' />"></script>
<script src="<c:url value='/js/comment.js' />"></script>
<c:set var="boardRetrieve" value="${map.board}"></c:set>
<c:set var="comment" value="${map.comment}"></c:set>
<div class="contentwrap">
	<article class="container">
		<div class="page-header">
			<h1>게시판 - 내용 자세히보기</h1>
		</div>
		<form class="form-horizontal" id="boardRetrieveForm">
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">글번호</label>
					
					<div class="col-sm-6">
						<input class="form-control" id="inputNum" type="text" name="num" value="${boardRetrieve.num}" readonly/>
					</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">작성자</label>
					<div class="col-sm-6">
						<input class="form-control" type="text" name="author" value="${boardRetrieve.author}" readonly/>
					</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">조회수</label>
					<div class="col-sm-6">
						<input class="form-control" type="text" name="readCnt" value="${boardRetrieve.readCnt}" disabled/>
					</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">글제목</label>
					<div class="col-sm-6">
						<input class="form-control" type="text" name="title" value="${boardRetrieve.title}">
					</div>
			</div>
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">글내용</label>
					<div class="col-sm-6">
						<textarea class="form-control" rows="10" name="content">${boardRetrieve.content}</textarea>
					</div>
				
			</div>
			</form>
			<div class="form-group">
				<div class="col-sm-12">
					<button id="boardListForm" class="btn btn-default pull-right">목록</button>
					<button id="boardDelete" class="btn btn-primary pull-right">삭제</button>
					<button id="boardUpdate" class="btn btn-warning pull-right">수정</button>
				</div>
			</div>
			<div class="page-header">
				<strong style="color:red">게시판 - 댓글</strong>
			</div>
			<table id="commentTable" class="table table-info">
				<c:forEach items="${comment}" var="comment">
					<tr class="active">
						<td>${comment.commentAuthor}&nbsp;&nbsp;${comment.commentContent}&nbsp;&nbsp;${comment.commentWriteday}</td>
					</tr>
				</c:forEach>
			</table>
                    <table class="table table-condensed">
                        <tr>
                            <td>
                                <span class="form-inline" role="form">
                                    <p>
                                     
                                        <div class="form-group">
                                            <input type="text" id="commentAuthor" name="commentAuthor" class="form-control col-lg-2" data-rule-required="true" value="${login.userid}" readOnly />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" id="commentPasswd" name="commentPasswd" class="form-control col-lg-2" data-rule-required="true" placeholder="패스워드" maxlength="10">
                                        </div>
                                        <button type="button" id="commentSubmit" name="commentParentSubmit" class="btn btn-default">저장</button>
                                    </p>
                                        <textarea id="commentContent" name="commentContent" class="form-control col-lg-12" style="width:100%" rows="4"></textarea>
                                       
                                </span>
                            </td>
                        </tr>
                    </table>
	</article>
</div>