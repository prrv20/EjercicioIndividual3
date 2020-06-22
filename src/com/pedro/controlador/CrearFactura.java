package com.pedro.controlador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pedro.modelo.Factura;

/**
 * Servlet implementation class CrearFactura
 */
@WebServlet("/CrearFactura")
public class CrearFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearFactura() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CrearFactura.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String fecha = request.getParameter("fecha");
		double subtotal = Double.parseDouble(request.getParameter("subtotal"));
		int impuesto = Integer.parseInt(request.getParameter("impuesto"));
		
		HttpSession sesion = request.getSession();
		List<Factura> listafacturas = (ArrayList<Factura>)sesion.getAttribute("sfact025");
		
		if (listafacturas == null) {
			listafacturas = new ArrayList<Factura>();
		}
		
		int ultid = 0;
		for (int i=0;i<listafacturas.size();i++) {
			Factura faux = listafacturas.get(i);
			if (faux.getIdfactura() > ultid)
				ultid = faux.getIdfactura();
		}
		
		Factura fact = new Factura();
		fact.setIdfactura(ultid+1);
		fact.setFecha(fecha);
		fact.setNombrecliente(nombre);
		fact.setSubtotal(subtotal);
		fact.setImpuesto(impuesto);
		listafacturas.add(fact);
		
		sesion.setAttribute("sfact025", listafacturas);
		
		String mensaje = "La factura ha sido creada exitosamente";
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("CrearFactura.jsp").forward(request, response);
	}

}