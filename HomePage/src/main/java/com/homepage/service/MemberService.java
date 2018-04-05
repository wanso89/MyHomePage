package com.homepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.MemberDAO;
import com.homepage.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	//회원가입 관련 DB Insert
	public void memberJoin(MemberDTO mDTO) {
		dao.memberJoin(mDTO);
	}
	
	
}
