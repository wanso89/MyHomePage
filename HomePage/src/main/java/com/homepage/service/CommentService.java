package com.homepage.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.CommentDAO;
import com.homepage.dto.CommentDTO;

@Service
public class CommentService {

	@Autowired
	CommentDAO dao;
	
	public Boolean commentWrite(HashMap<String,String> map) {
		boolean result = false;
		int n = dao.commentWrite(map);
		if(n>0) {
			result = true;
		}
		return result;
	}
	
	public List<CommentDTO> commentList(int num){
		return dao.commentList(num);
	}
	
}
