package com.homepage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.BoardDTO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate template;
	
	//글 전체목록
	public List<BoardDTO> boardList(){
		return template.selectList("BoardMapper.boardList");
	}
	
	//글 쓰기
	public int boardWrite(BoardDTO bDTO) {
		
		int n = template.insert("BoardMapper.boardWrite",bDTO);
		return n;
	}
}
