package com.homepage.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.homepage.dto.CommentDTO;
import com.homepage.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService service;
	
	//댓글 쓰기
	@RequestMapping(value="loginAfter/commentWrite")
	@ResponseBody
	public Boolean commentWrite(@RequestParam HashMap<String,String> map) {
		return service.commentWrite(map);
		
	}
	
	//댓글 리스트
	@RequestMapping(value="loginAfter/commentList")
	@ResponseBody
	public List<CommentDTO> commetList(@RequestParam int num) {
		System.out.println(num);
		List<CommentDTO> commentList = service.commentList(num);
		return commentList;
	}
}
