package cl.aiep.spring.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.aiep.spring.entities.Product;
import cl.aiep.spring.services.ProductService;
import cl.aiep.spring.services.ProductlineService;

@Controller
public class WebController {

	@Autowired
	private ProductService productService;
	
	@Autowired 
	private ProductlineService productLineService;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		model.addAttribute("productos", productService.listar());
		model.addAttribute("lineas", productLineService.listar());
		model.addAttribute("vendedores", productService.listar());
		return "index";	
	}
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	@PostMapping("/filtro")
	public ModelAndView postFiltro(@RequestParam("productScale") 
	String productScale, @RequestParam("productLine") 
	String productLine, @RequestParam("productVendor")
	String productVendor, ModelAndView model) {
		Product product = new Product();
		if(!productScale.isEmpty()) {
			product.setProductScale(productScale);
		}
		if(!productLine.isEmpty()) {
			product.setProductline(productLineService.buscar(productLine));
		}
		if(!productVendor.isEmpty()) {
			product.setProductVendor(productVendor);
		}
		model.setViewName("index");
		model.addObject("productos", productService.listarFiltro(product));
		model.addObject("lineas", productLineService.listar());
		model.addObject("vendedores", productService.listarFiltro(product));
		return model;
	}
}
