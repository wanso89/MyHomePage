package com.homepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.BoardDAO;

@Service
public class BoardService {

	
	@Autowired
	BoardDAO dao;
}
