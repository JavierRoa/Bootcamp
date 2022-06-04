package cl.aiep.spring.services;

import org.springframework.stereotype.Service;

import cl.aiep.spring.entities.Customer;
import cl.aiep.spring.entities.Employee;
import cl.aiep.spring.repositories.CustomerRepo;
import cl.aiep.spring.repositories.EmployeeRepo;
import cl.aiep.spring.userdetails.Usuario;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Employee> optional = employeeRepo.findByEmailIs(username);
		Optional<Customer> optional2 = customerRepo.findByUsernameIs(username);
		if(optional.isPresent()) {
			//Se crea el objeto de tipo (en este caso) Employee
			Employee e = optional.get();
			//Se crea un ArrayList que contendra los permisos asignados al usuario
			ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
			//Se le otorga un permiso de "ADMIN" (en este caso)
			roles.add(new SimpleGrantedAuthority("ADMIN"));	
			//Se le agrega un permiso con el mismo nombre de su puesto de trabajo
			roles.add(new SimpleGrantedAuthority(e.getJobTitle()));
			/*	Se crea el objeto de user (polimorfismo de UserDetails), que pide:
			 * Usuario
			 * Contraseña
			 * Permisos
			 */
			UserDetails userDT = new User(e.getEmail(), e.getPassword(), roles);
			//Se crea un objeto de clase usuario (según lo definido en su clase)
			Usuario usuario = new Usuario((User) userDT, e.getFirstName(), e.getLastName());
			return usuario;
		}
		else if (optional2.isPresent() ) {
			Customer e = optional2.get();			
			ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
			roles.add(new SimpleGrantedAuthority("CUSTOMER"));			
			UserDetails userDT = new User(e.getUsername(), e.getPassword(), roles);
			Usuario usuario = new Usuario((User) userDT, e.getContactFirstName(), e.getContactLastName());
			return usuario;
		}
		else {
			throw new UsernameNotFoundException(username);
		}
	}
}