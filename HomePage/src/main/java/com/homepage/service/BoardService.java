package com.homepage.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.BoardDAO;
import com.homepage.dto.BoardDTO;
import com.homepage.dto.PageDTO;

@Service
public class BoardService {

	
	@Autowired
	BoardDAO dao;
	
	public PageDTO boardList(int curPage,HashMap<String,String> map){
		return dao.boardList(curPage, map);
	}
	
	public Boolean boardWrite(BoardDTO bDTO) {
		
		boolean result = false;
		int n = dao.boardWrite(bDTO);
		if(n>0) {
			result = true;
		}
		return result;
	}
	
	public HashMap<String,Object> boardRetrieve(int num) {
		return dao.boardRetrieve(num);
	}
	
	public Boolean boardUpdate(BoardDTO bDTO) {
		boolean result = false;
		int n = dao.boardUpdate(bDTO);
		if (n>0) {
			result = true;
		}
		return result;
	}
	
	public Boolean boardDelete(int num) {
		boolean result = false;
		int n = dao.boardDelete(num);
		if(n>0) {
			result = true;
		}
		return result;
	}
	
}
