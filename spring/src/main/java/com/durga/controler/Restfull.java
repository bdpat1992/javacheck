package com.durga.controler;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durga.exceptions.SpringException;
import com.durga.viewobjects.ApCm;

@RestController
public class Restfull {
	
	@RequestMapping(value="/usersList")
	@ExceptionHandler({SpringException.class})
	public String usersList(@ModelAttribute("userForm") ApCm apcm,BindingResult results,Model model) {
		apcm.setName("pawan");
		apcm.setParty("Jenasena");
		if("pawan".equalsIgnoreCase("pawan")) {
			throw new SpringException("exceptio occured in userlist controll");
		}
		
		
		return "success";
		
	}
	
	@RequestMapping(value="/saveUser")
	public String saveUser(@Valid @ModelAttribute("userForm")ApCm apcm,BindingResult results,Model model) {
		
		if(results.hasErrors()) {
			apcm.setName("Failed");
			System.out.println("failed");
		}else {
		apcm.setName("success");
		}
		return "success";
	
	}
}
