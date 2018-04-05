package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.homepage.dto.MemberDTO;
import com.homepage.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	
	//메인페이지 이동
	@RequestMapping(value="indexPage")
	public ModelAndView indexPage() {
		return new ModelAndView("redirect:/");
	}
	
	//회원 가입 관련 DB Insert
	@RequestMapping(value="memberJoin", method=RequestMethod.POST)
	public ModelAndView memberJoin(MemberDTO mDTO) {
		service.memberJoin(mDTO);
		return new ModelAndView("redirect:/");
	}
	
	
	
	
}
