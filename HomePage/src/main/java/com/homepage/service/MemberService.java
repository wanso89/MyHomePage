package com.homepage.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.MemberDAO;
import com.homepage.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	//회원가입 관련 DB Insert
	public Boolean memberJoin(MemberDTO mDTO) {
		boolean result = false;
		int n = idCheck(mDTO.getUserid());
		if(n == 0) {
			dao.memberJoin(mDTO);
			result = true;
		}
		return result;
		
	}
	
	//로그인 체크
	public Boolean loginCheck(HashMap<String,String> map) {
		boolean result = false;
		int n = dao.loginCheck(map);
		if(n == 1) {
			result = true;
		}
		return result;
	}
	
	//ID 중복체크
	public int idCheck(String userid) {
		return dao.idCheck(userid);
	}
}
