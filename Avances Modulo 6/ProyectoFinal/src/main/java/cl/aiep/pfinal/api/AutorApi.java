package cl.aiep.pfinal.api;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.pfinal.dao.AutorDao;
import cl.aiep.pfinal.dto.AutorDto;

@RestController // Notación para API Rest
@RequestMapping("/autores") // Notación que define URL
@CrossOrigin // Notación que permite llamar desde fuentes externas
public class AutorApi {

	@Autowired // Notación para conexión con el Dao
	private AutorDao autorDao;
	
	private ModelMapper mapper = new ModelMapper();
	
	@GetMapping("")
	public List<AutorDto> listar() {
		List<AutorDto> lista = new ArrayList<>();
		autorDao.listar().stream().forEach(autor -> lista.add(mapper.map(autor, AutorDto.class)));
		return lista;
	}
}
