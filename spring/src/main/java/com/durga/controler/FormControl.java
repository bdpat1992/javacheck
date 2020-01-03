package com.durga.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.durga.viewobjects.ApCm;

@Controller
public class FormControl {

	@RequestMapping(value="/saveForm")
	public String getForm(Model model) {
		ApCm cm=new ApCm(1,"durga","jsp");
		model.addAttribute("Contastant",cm);
		return"success";
		
	}
	
	
	
	
	
	
	
}
