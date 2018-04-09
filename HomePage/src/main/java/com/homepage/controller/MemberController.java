package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody
	public Boolean memberJoin(MemberDTO mDTO) {
		return service.memberJoin(mDTO);
	}
	
	//아이디 중복체크
	@RequestMapping(value="idCheck")
	@ResponseBody
	public int idCheck(@RequestParam String userid) {
		return service.idCheck(userid);
	}
	
	
}
