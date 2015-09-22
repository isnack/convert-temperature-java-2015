package br.edu.univas.si6.converttemperatures.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.univas.si6.converttemperatures.services.ConvertTemperaturesService;

/**
 * Servlet implementation class ConvertTemperaturesController
 */
@WebServlet("/ConvertTemperaturesController")
public class ConvertTemperaturesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertTemperaturesController() {
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				Float temperature = Float.valueOf(request.getParameter("temp"));
				String type = request.getParameter("type").toString();
				String result =null;
				
				if (!temperature.isNaN()){
					result = ConvertTemperaturesService.getTemperature(temperature, type);
				}else{
					 result ="0";
					
				}
				
				
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
