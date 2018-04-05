package com.homepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.homepage.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	BoardService service;
}
