package com.homepage.dao;

import java.util.HashMap;
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
	
	//글 자세히보기
	public BoardDTO boardRetrieve(int num){
		readCntAdd(num);
		return template.selectOne("BoardMapper.boardRetrieve",num);
	}
	
	//조회수 증가
	private void readCntAdd(int num) {
		template.update("BoardMapper.readCntAdd",num);
	}
	
	//글 수정하기
	public int boardUpdate(BoardDTO bDTO) {
		int n = template.update("BoardMapper.boardUpdate",bDTO);
		return n;
	}
	
	//글 검색하기
	public List<BoardDTO> boardSearch(HashMap<String,String> map){
		return template.selectList("BoardMapper.boardSearch",map);
	}
	
	
	
	
	
	
	
}
