<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/bootstrap.css' />" />
<link rel="stylesheet" type="text/css"	href="<c:url value='/css/css.css' />" />


<c:set value="${pDTO}" var="pageDTO"/>
<c:set value="${pDTO.curPage}" var="curPage"/>
<c:set value="${pDTO.perPage}" var="perPage"/>
<c:set value="${pDTO.searchName}" var="searchName"/>
<c:set value="${pDTO.searchValue}" var="searchValue"/>
<c:set value="${pDTO.totalCount}" var="totalCount" />
<c:set value="${totalCount/perPage}" var="pageNum"/>

<c:if test="${totalCount % perPage != 0}">
	<c:set var="pageNum" value="${pageNum+1}"/>
</c:if>


<div class="form-group text-center">
	<ul class="pagination">
		<c:forEach var="i" begin="1" end="${pageNum}" varStatus="status">
			<c:if test="${curPage == (status.index)}">
				<li class="page-item"><a class="page-link">${status.index}</a></li>
			</c:if>
			<c:if test="${curPage != (status.index)}">
				<li class="page-item">
					<a class="page-link" 
					   href="<c:url value='/loginAfter/boardForm?curPage=${status.index}&searchName=${searchName}
					                            &searchValue=${searchValue}'/>">${status.index}</a>
				</li>
			</c:if>
	    	
	    </c:forEach>
  	</ul>
</div>
<a class="btn btn-default pull-right" href="<c:url value='/loginAfter/boardWriteUI'/>" role="button">글쓰기</a>
