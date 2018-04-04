package com.homepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.MemberDAO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
}
