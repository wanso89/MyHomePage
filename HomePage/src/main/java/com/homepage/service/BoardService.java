package com.homepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.BoardDAO;
import com.homepage.dto.BoardDTO;

@Service
public class BoardService {

	
	@Autowired
	BoardDAO dao;
	
	public List<BoardDTO> boardList(){
		return dao.boardList();
	}
	
	public Boolean boardWrite(BoardDTO bDTO) {
		
		boolean result = false;
		int n = dao.boardWrite(bDTO);
		if(n>0) {
			result = true;
		}
		return result;
	}
}
