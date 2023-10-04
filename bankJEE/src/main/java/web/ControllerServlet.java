package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ControllerServlet  extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	super.doGet(request, response);
	request.getRequestDispatcher("Vue.jsp").forward(request, response);
	
}

@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}

@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
