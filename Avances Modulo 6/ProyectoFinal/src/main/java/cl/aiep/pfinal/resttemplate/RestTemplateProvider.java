package cl.aiep.pfinal.resttemplate;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cl.aiep.pfinal.dto.AutorDto;
import cl.aiep.pfinal.dto.LibroDto;

public class RestTemplateProvider {

	//String con las credenciales de acceso
	private final String credentials = "admin:12345";
	
	//Se transforma el String de credenciales a bytes
	private final byte[] credentialsBytes = credentials.getBytes();
	
	//Se encriptan las credenciales usando Base64
	private final byte[] base64CredentialsBytes = Base64.encodeBase64(credentialsBytes);
	
	//Se transforman las credenciales encriptadas en String nuevamente
	private final String base64Credentials = new String(base64CredentialsBytes);
	
	public List<LibroDto> getLibrosFromApi() {
		//Se crea una instancia de RestTemplate para consumo de API
		RestTemplate rest = new RestTemplate();
		//Se crea un encabezado de una request HTTP
		HttpHeaders header = new HttpHeaders();
		//Se añaden las credenciales para ingresar a la API (encriptadas)
		header.add("Authorization","Basic " + base64Credentials);
		//Se crea la request HTTP
		HttpEntity<String> request = new HttpEntity<>(header);
		String url = "http://localhost:8181/libros";
		//Se obtiene la lista de libros desde la API en una "response" por método GET
		ResponseEntity<List<LibroDto>> response = rest.exchange(
				url,
				HttpMethod.GET,
				request,
				new ParameterizedTypeReference<>(){});
		return response.getBody();
	}
	public List<AutorDto> getAutoresFromApi() {
		//Se crea una instancia de RestTemplate para consumo de API
		RestTemplate rest = new RestTemplate();
		//Se crea un encabezado de una request HTTP
		HttpHeaders header = new HttpHeaders();
		//Se añaden las credenciales para ingresar a la API (encriptadas)
		header.add("Authorization","Basic " + base64Credentials);
		//Se crea la request HTTP
		HttpEntity<String> request = new HttpEntity<>(header);
		String url = "http://localhost:8181/autores";
		//Se obtiene la lista de libros desde la API en una "response" por método GET
		ResponseEntity<List<AutorDto>> response = rest.exchange(
				url,
				HttpMethod.GET,
				request,
				new ParameterizedTypeReference<>(){});
		return response.getBody();
	}
}
