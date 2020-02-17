package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteCadController {
	
	@RequestMapping("/CadastroCliente")
	  public ModelAndView CadastrarCliente(){
			
	        ModelAndView modelAndView = new ModelAndView("CadCliente");
	        
	        return modelAndView;
	    }

}
