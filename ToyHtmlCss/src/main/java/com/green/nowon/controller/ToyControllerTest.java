package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class ToyControllerTest {
	
	@GetMapping("/goodsTest")
	public void goods() {
		
	}

	@GetMapping("/mypageTest")
	public void mypage() {
		
	}
	
	@GetMapping("/mypage/cartTest")
	public void cart() {
		
	}
	
	@GetMapping("/mypage/view_order_listTest")
	public void view_order_list() {
		
	}
	
}
