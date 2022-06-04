package cl.aiep.pfinal.api;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.pfinal.dao.LibroDao;
import cl.aiep.pfinal.dto.LibroDto;

@RestController //Notación para API Rest
@RequestMapping("/libros") //Notación que define URL
@CrossOrigin //Notación que permite llamar desde fuentes externas
public class LibroApi {

	@Autowired //Notación para conexión con el service
	private LibroDao libroDao;
	
	private ModelMapper mapper = new ModelMapper();
	
	@GetMapping("")
	public List<LibroDto> listar() {
		List<LibroDto> lista = new ArrayList<>();
		libroDao.listar().stream().forEach(libro -> lista.add(mapper.map(libro, LibroDto.class)));
		return lista;
	}
}
