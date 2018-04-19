package com.homepage.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.BoardDTO;
import com.homepage.dto.CommentDTO;
import com.homepage.dto.PageDTO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate template;
	
	//글 전체목록 -> 페이징 처리 포함 변경
	public PageDTO boardList(int curPage, HashMap<String,String> map){
		PageDTO pDTO = new PageDTO();
		int start = (curPage - 1) * pDTO.getPerPage();
		int end = pDTO.getPerPage();
		int totalCount = 0;
		List<BoardDTO> boardList = template.selectList("BoardMapper.boardList",map,
									new RowBounds(start,end));
		if((map.get("searchValue") == null)) {
			totalCount = totalCount();
		} else {
			totalCount = searchCount(map);
		}
		pDTO.setBoardList(boardList);
		pDTO.setCurPage(curPage);
		pDTO.setTotalCount(totalCount);
		pDTO.setSearchName(map.get("searchName"));
		pDTO.setSearchValue(map.get("searchValue"));
		
		return pDTO;
	}
	
	//글 쓰기
	public int boardWrite(BoardDTO bDTO) {
		
		int n = template.insert("BoardMapper.boardWrite",bDTO);
		return n;
	}
	
	//글 자세히보기 및 댓글
	public HashMap<String,Object> boardRetrieve(int num){
		readCntAdd(num);
		BoardDTO bDTO = template.selectOne("BoardMapper.boardRetrieve",num);
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("board", bDTO);
		map.put("comment",commentList(num));
		
		return map;
	}
	
	//댓글 가져오기
		private List<CommentDTO> commentList(int num) {
			return template.selectList("CommentMapper.commentList",num);
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
	
	//글 삭제하기
	public int boardDelete(int num) {
		int n = template.delete("BoardMapper.boardDelete",num);
		return n;
	}
	
	//글 전체개수
	private int totalCount() {
		return template.selectOne("BoardMapper.totalCount");
	}
	
	//글 검색개수
	private int searchCount(HashMap<String,String> map) {
		return template.selectOne("BoardMapper.searchCount",map);
	}
	
	
	
}
