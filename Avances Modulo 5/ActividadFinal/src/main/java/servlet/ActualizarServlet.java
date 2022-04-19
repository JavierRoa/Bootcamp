package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Electrodomestico;
import modelo.Estado;
import modelo.OrdenServicio;
import modelo.Region;
import service.EstadoService;
import service.OrdenService;

/**
 * Servlet implementation class ActualizarServlet
 */
@WebServlet("/ActualizarServlet")
public class ActualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarServlet() {

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
		int id = Integer.parseInt(request.getParameter("id"));
		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String tel = request.getParameter("tel");
		int tipoElecId = Integer.parseInt(request.getParameter("tipoElecId"));
		String tipoElec = request.getParameter("tipoElec");
		int regionId = Integer.parseInt(request.getParameter("regionId"));
		String region = request.getParameter("region");
		String comuna = request.getParameter("comuna");
		String direccion = request.getParameter("direccion");
		String fecha = request.getParameter("fecha");
		String fechaAct = request.getParameter("fechaAct");
		int estadoId = Integer.parseInt(request.getParameter("estado"));
		String obs = request.getParameter("obs");
		
		Electrodomestico elec = new Electrodomestico(tipoElecId, tipoElec);
		Region reg = new Region(regionId, region);
		EstadoService registroEstado = new EstadoService();
		Estado est = registroEstado.buscar(estadoId);
		
		OrdenServicio orden = new OrdenServicio(id, rut, nombre, tel, elec, reg, comuna, direccion, fecha, fechaAct, est, obs);
		OrdenService registro = new OrdenService();
		
		int r = registro.actualizar(orden);
		
		if(r==1) {
			request.getSession().setAttribute("orden", registro.listar());
			response.sendRedirect("/ActividadFinal/jsp/tabla.jsp");
		}
		else {
			response.sendRedirect("/ActividadFinal/jsp/formulario.jsp");
		}
	}

}
