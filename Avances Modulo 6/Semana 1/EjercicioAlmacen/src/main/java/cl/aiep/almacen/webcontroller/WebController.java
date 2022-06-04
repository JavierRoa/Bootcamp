package cl.aiep.almacen.webcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.aiep.almacen.entities.Marca;
import cl.aiep.almacen.entities.Producto;
import cl.aiep.almacen.entities.Proveedor;
import cl.aiep.almacen.services.MarcaService;
import cl.aiep.almacen.services.ProductoService;
import cl.aiep.almacen.services.ProveedorService;
@Controller
public class WebController {
	//Le das nombre al modelo. Nombre que se mantendrá para el uso en la página
	@ModelAttribute("miProducto")
	//Creas un creador (un método que retorna la creación de un objeto)
	public Producto newProducto() {
		return new Producto();
	}
	@ModelAttribute("miMarca")
	public Marca newMarca() {
		return new Marca();
	}
	@ModelAttribute("miProveedor")
	public Proveedor newProveedor() {
		return new Proveedor();
	}
	
	@Autowired
	private ProductoService productoService;
	@Autowired
	private MarcaService marcaService;
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("")//Se ponen comillas, porque no hay nada luego de "localhost"
	public String getIndex(Model model) {
		model.addAttribute("prod", productoService.listar());
		//Retorna a la página principal
		return "TablaProductos";
	}
	@GetMapping("/registroProducto")
	public String goRegProd(Model model) {
		model.addAttribute("marca", marcaService.listar());
		model.addAttribute("proveedor", proveedorService.listar());
		return "RegistroProductos";
	}
	@GetMapping("/registroMarca")
	public String goRegMar(Model model) {
		return "RegistroMarca";
	}
	@GetMapping("/registroProveedor")
	public String goRegProv(Model model) {
		return "RegistroProveedor";
	}
	//Se establece la URL luego del localhost que deberá escribirse
	//para llegar a la pagina en el return.
	@PostMapping("/registroProducto")
	//El BindingResult permite invocar el hasErrors, por lo que trabaja en conjunto con @Valid.
	public String agregarProducto(@Valid @ModelAttribute("miProducto") Producto producto,
			BindingResult bindingResult,
			Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("marca", marcaService.listar());
			model.addAttribute("proveedor", proveedorService.listar());
			return "RegistroProductos";
		}
		else {
			model.addAttribute("prod", producto);
			return "ResumenProductos";
		}
	}
}
