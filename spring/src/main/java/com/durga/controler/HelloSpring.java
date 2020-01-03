package com.durga.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.durga.service.ApCmServices;

@Controller
public class HelloSpring {
	
	@Autowired
	ApCmServices apCmServices;
	
	@RequestMapping("/hello")
	public String helloSpring(Model model) {
		System.out.println("in controller ");
		
		model.addAttribute("cmlist",apCmServices.getApCmList());
		
		return "helloSpring";
	}

}
