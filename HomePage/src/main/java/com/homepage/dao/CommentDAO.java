package com.homepage.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.CommentDTO;

@Repository
public class CommentDAO {
	
	@Autowired
	SqlSessionTemplate template;

	public int commentWrite(HashMap<String,String> map) {
		int n = template.insert("CommentMapper.commentWrite",map);
		return n;
	}
	
	public List<CommentDTO> commentList(int num){
		return template.selectList("CommentMapper.commentList",num);
	}

	
}
