package com.homepage.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.homepage.dto.BoardDTO;
import com.homepage.dto.PageDTO;
import com.homepage.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	// 글 전체목록보기
		@RequestMapping(value="/loginAfter/boardForm")
		public ModelAndView boardList(@RequestParam(required=false, defaultValue="1") int curPage,
										@RequestParam HashMap<String,String> map) {
			PageDTO pDTO = service.boardList(curPage, map);
			return new ModelAndView("boardForm","pDTO",pDTO);
	}
		
	//글 작성하기
	@RequestMapping(value="/loginAfter/boardWrite")
	@ResponseBody
	public Boolean boardWrite(BoardDTO bDTO) {
		return service.boardWrite(bDTO);
	}
	
	// 글 자세히보기 및 댓글처리
	@RequestMapping(value="/loginAfter/boardRetrieve")
	public ModelAndView boardRetrieve(@RequestParam int num) {
		HashMap<String,Object> board_Comment = service.boardRetrieve(num);
		System.out.println(board_Comment.get("comment"));
		return new ModelAndView("boardRetrieve","map",board_Comment);
	}
	
	// 글 수정하기
	@RequestMapping(value="/loginAfter/boardUpdate")
	@ResponseBody
	public Boolean boardUpdate(BoardDTO bDTO) {
		return service.boardUpdate(bDTO);
	}
	
	// 글 삭제하기
	@RequestMapping(value="loginAfter/boardDelete")
	@ResponseBody
	public Boolean boardDelete(@RequestParam int num) {
		return service.boardDelete(num);
	}
}
