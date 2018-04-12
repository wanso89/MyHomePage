package com.homepage.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.homepage.dto.MemberDTO;
import com.homepage.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	
	//메인페이지 이동
	@RequestMapping(value="/indexPage")
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
	
	//로그인
	@RequestMapping(value="loginCheck", method=RequestMethod.POST)
	@ResponseBody
	public Boolean loginCheck(@RequestParam HashMap<String,String> map,
			                  HttpSession session) {
		session.setAttribute("login", map);
		return service.loginCheck(map);
	}
	
	//로그아웃
	@RequestMapping(value="/loginAfter/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes attrs) {
		session.invalidate();
		attrs.addFlashAttribute("logout", "정상적으로 로그아웃이 되었습니다.");
		return new ModelAndView("redirect:/");
	}
	
	
	
}
