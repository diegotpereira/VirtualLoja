package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuemSomosController {
	
	@RequestMapping("/Somos")
	  public ModelAndView Somos(){
			
	        ModelAndView modelAndView = new ModelAndView("QuemSomos");
	        
	        return modelAndView;
	    }


}
