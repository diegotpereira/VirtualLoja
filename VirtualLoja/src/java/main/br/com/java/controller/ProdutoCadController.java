package br.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoCadController {
	
	@RequestMapping("/CadastroProduto")
	  public ModelAndView CadastrarProduto(){
			
	        ModelAndView modelAndView = new ModelAndView("CadProduto");
	        
	        return modelAndView;
	    }

}
