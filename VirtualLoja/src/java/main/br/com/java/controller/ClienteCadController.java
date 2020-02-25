package br.com.java.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.java.models.Pessoa;
import br.com.java.service.PessoaService;

@Controller
public class ClienteCadController {

	
    @Autowired 
	private PessoaService pessoaService;
    
    @RequestMapping(value = "/CadastroCliente")
	  public ModelAndView CadastrarCliente(){
			
	        ModelAndView modelAndView = new ModelAndView("CadCliente");
	        
	        return modelAndView;
	    }
	
	@RequestMapping(value = "/adicionaPessoa", method = RequestMethod.POST)
	public ModelAndView salvarPessoa(@ModelAttribute Pessoa pessoa) {
		if (pessoa.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			pessoaService.addPessoa(pessoa);
		} else {
			pessoaService.updatePessoa(pessoa);
		}
		return new ModelAndView("redirect:/");
	}
	
	

}
