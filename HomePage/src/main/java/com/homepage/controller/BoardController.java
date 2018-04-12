package com.homepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.homepage.dto.BoardDTO;
import com.homepage.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	BoardService service;
	
	//글 작성하기
	@RequestMapping(value="/loginAfter/boardWrite")
	@ResponseBody
	public Boolean boardWrite(BoardDTO bDTO) {
		return service.boardWrite(bDTO);
	}
	
	// 글 전체목록보기
	@RequestMapping(value="/loginAfter/boardForm")
	public ModelAndView boardList() {
		List<BoardDTO> boardList = service.boardList();
		return new ModelAndView("boardForm","boardList",boardList);
	}
}
