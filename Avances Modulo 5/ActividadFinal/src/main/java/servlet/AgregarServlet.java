package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Electrodomestico;
import modelo.OrdenServicio;
import modelo.Region;
import service.OrdenService;

/**
 * Servlet implementation class Actividad1Servlet
 */
@WebServlet("/AgregarServlet")
public class AgregarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Se obtiene el rol de la sesión, y se pasa a String
		String rolSesion = request.getSession().getAttribute("permiso").toString();
		String rut;
		if(rolSesion.equals("1")) {
			rut = request.getParameter("rut");
		}
		else {
			rut = request.getSession().getAttribute("rutUsuario").toString();
		}
		
		String nombre = request.getParameter("nombre");
		String tel = request.getParameter("tel");
		int tipoElecId = Integer.parseInt(request.getParameter("tipoElec"));
		int regionId = Integer.parseInt(request.getParameter("region"));
		String comuna = request.getParameter("comuna");
		String direccion = request.getParameter("direccion");
		String fecha = request.getParameter("fecha");
		String obs = request.getParameter("obs");
		
		Electrodomestico tipoElec = new Electrodomestico(tipoElecId);
		Region region = new Region(regionId);
		
		
		OrdenServicio orden = new OrdenServicio(rut, nombre, tel, tipoElec, region, comuna, direccion, fecha, obs);
		OrdenService registro = new OrdenService();
		
		int r = registro.agregar(orden);
		
		if(r==1) {
			request.getSession().setAttribute("orden", registro.listar());
			response.sendRedirect("/ActividadFinal/jsp/formulario.jsp");
		}
		else {
			response.sendRedirect("/ActividadFinal/jsp/formulario.jsp");
		}
		
	}
}
