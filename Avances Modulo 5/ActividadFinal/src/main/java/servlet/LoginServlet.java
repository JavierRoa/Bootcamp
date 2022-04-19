package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import service.UsuarioService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recibo en strings los datos ingresados en el login
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		// Creo un modelo de tipo UsuarioService para acceder a los métodos del controlador
		UsuarioService ru = new UsuarioService();
		// Creo un modelo usuario para poder buscar los datos para compararlos con lo ingresado
		Usuario user = ru.buscar(usuario, clave);
		// Si el usuario coincide, verifico qué rol tendrá y le doy los permisos requeridos
		if(user!=null) {
			request.getSession().setAttribute("permiso", user.getRol());
			request.getSession().setAttribute("rutUsuario", user.getRut());
			response.sendRedirect("/ActividadFinal/jsp/menu.jsp");
		}
		// Si no existe el usuario, lo reenvío a la página de login
		else {
			response.sendRedirect("/ActividadFinal/jsp/home.jsp");
		}
	}
}
