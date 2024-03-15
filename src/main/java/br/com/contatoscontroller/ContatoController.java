package br.com.contatoscontroller;


	import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

	@RestController
	@RequestMapping("/contatos")
	public class ContatoController {

	    private String nomeFixo = "Fulano";
	    private String telefoneFixo = "123456789";
	    private String emailFixo = "fulano@example.com";

	    
	    @GetMapping
	    public Contato getContato() {
	        return new Contato(nomeFixo, telefoneFixo, emailFixo);
	    }
	    
	    @GetMapping("/lista")
	    public ModelAndView getList() {
	    	String viewName;
			ModelAndView mv = new ModelAndView(viewName:"index");
	    	return mv;
	    }
	    

	    
	    @PostMapping
	    public String cadastrarContato(@RequestBody Contato novoContato) {
	        return "Contato cadastrado com sucesso!";
	    }

	    
	    @DeleteMapping("/{telefone}")
	    public String deletarContato(@PathVariable String telefone) {
	        return "Contato com telefone " + telefone + " excluído com sucesso!";
	    }
	    
	    
	}


