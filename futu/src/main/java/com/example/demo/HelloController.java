package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HOGEと返すだけ
 * 
 * @author atsushi
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {

	@GetMapping
	@ResponseBody
	public String hello() {
		return "HOGE";
	}
}
