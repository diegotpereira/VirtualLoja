package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {
	
	@RequestMapping("/ListaProduto")
	  public ModelAndView ListarProduto(){
			
	        ModelAndView modelAndView = new ModelAndView("ListaProduto");
	        
	        return modelAndView;
	    }

}
