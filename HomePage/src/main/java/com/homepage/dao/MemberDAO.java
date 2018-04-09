package com.homepage.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.MemberDTO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate template;
	
	//회원가입 관련 DB Insert
	public void memberJoin(MemberDTO mDTO) {
		template.insert("MemberMapper.memberJoin",mDTO);
	}
	
	//ID중복체크
	public int idCheck(String userid) {
		return template.selectOne("MemberMapper.idCheck",userid);
	}
	
	//로그인 체크
	public int loginCheck(HashMap<String,String> map) {
		return template.selectOne("MemberMapper.loginCheck",map);
	}
}
