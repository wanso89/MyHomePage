package com.homepage.dto;

import java.util.List;

public class PageDTO {

	private List<BoardDTO> boardList; // 전체 게시물
	private int curPage; //현재페이지 번호
	private int perPage=3; // 한 페이지당 몇개 보여줄건지?
	private int totalCount; //게시물 전체 개수
	private String searchName; //글 검색 
	private String searchValue; // 글 검색 관련 실 데이터
	
	public List<BoardDTO> getBoardList() {
		return boardList;
	}
	public void setBoardList(List<BoardDTO> boardList) {
		this.boardList = boardList;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	@Override
	public String toString() {
		return "PageDTO [boardList=" + boardList + ", curPage=" + curPage + ", perPage=" + perPage + ", totalCount="
				+ totalCount + ", searchName=" + searchName + ", searchValue=" + searchValue + "]";
	}

	
	
	
}
