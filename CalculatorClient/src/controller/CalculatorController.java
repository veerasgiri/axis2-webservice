package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.*;
import ws.CalculatorStub.Addition;
import ws.CalculatorStub.Division;
import ws.CalculatorStub.Multiplication;
import ws.CalculatorStub.Subtraction;
/**
 * Servlet implementation class CalculatorController
 */
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorController() {
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
		int numberA = Integer.parseInt(request.getParameter("numberA"));
		int numberB = Integer.parseInt(request.getParameter("numberB"));
		String operation = request.getParameter("operation");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try{
			CalculatorStub cs = new CalculatorStub();
			
			if(operation.equals("Addition")){
			Addition ad = new Addition();
			ad.setA(numberA);
			ad.setB(numberB);
			out.print("<br>Result Addition: </br>"+cs.addition(ad).get_return());
		}else if(operation.equals("Subtraction")){
			Subtraction sb = new Subtraction();
			sb.setA(numberA);
			sb.setB(numberB);
			out.print("<br>Result Subsraction: </br>"+cs.subtraction(sb).get_return());
		}else if(operation.equals("Multiplication")){
			Multiplication mp = new Multiplication();
			mp.setA(numberA);
			mp.setB(numberB);
			out.print("<br>Result Multiplication: </br>"+cs.multiplication(mp).get_return());
		}else if(operation.equals("Division")){
			Division dv = new Division();
			dv.setA(numberA);
			dv.setB(numberB);
			out.print("<br>Result Division: </br>"+cs.division(dv).get_return());
		}
			
		}catch(Exception e){
			out.print(e.getMessage());
		}
	}

}
