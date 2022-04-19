package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ElecService;
import service.EstadoService;
import service.OrdenService;
import service.RegionService;

/**
 * Servlet implementation class ModificarServlet
 */
@WebServlet("/ModificarServlet")
public class ModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		int id = Integer.parseInt(request.getParameter("id"));
		OrdenService registroOrden = new OrdenService();
		request.getSession().setAttribute("editar", registroOrden.buscar(id));
		EstadoService est = new EstadoService();
		request.getSession().setAttribute("estado", est.listar());
		response.sendRedirect("/ActividadFinal/jsp/readonly.jsp");
	}

}
