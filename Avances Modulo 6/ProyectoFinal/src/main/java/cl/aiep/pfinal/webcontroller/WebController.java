package cl.aiep.pfinal.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.aiep.pfinal.resttemplate.RestTemplateProvider;

@Controller
public class WebController {

	@GetMapping("/login")
	public String getLogin() {
		return "login2";
	}
	@GetMapping("/")
	public String getWelcome(Model model) {
		RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
		model.addAttribute("libro", restTemplateProvider.getLibrosFromApi());
		return "welcome";
	}

	@GetMapping("/autores2")
	public String getAutores(Model model) {
		RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
		model.addAttribute("autor", restTemplateProvider.getAutoresFromApi());
		return "welcome2";
	}
}