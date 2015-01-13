package iemyditlazardenisebianca;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CloudLabTest1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{
		resp.setContentType("text/plain");
		
		String A, B, C, D;
		Float a, b, c, d, answer;
		
		//Get all parameters specified in the url
		A = req.getParameter("A");
		B = req.getParameter("B");
		C = req.getParameter("C");
		D = req.getParameter("D");
		
		
		if ((A == null) || (B == null) || (C == null) || (D == null)){
			resp.getWriter().println("ERROR: Some values haven't been specified.");
		}
		else{
			
			try{
				a = Float.parseFloat(A.trim());
			}
			catch(NumberFormatException e){
				resp.getWriter().println("A is not a number! Initializing it to 0");
				a = (float)0;
			}
			
			try{
				b = Float.parseFloat(B.trim());
			}
			catch(NumberFormatException e){
				resp.getWriter().println("B is not a number! Initializing it to 0");
				b = (float)0;
			}
			
			
			try{
				c = Float.parseFloat(C.trim());
			}
			catch(NumberFormatException e){
				resp.getWriter().println("C is not a number! Initializing it to 0");
				c = (float)0;
			}
			
			
			try{
				d = Float.parseFloat(D.trim());
			}
			catch(NumberFormatException e){
				resp.getWriter().println("D is not a number! Initializing it to 0");
				d = (float)0;
			}
			
			//Calculate the answer
			answer = ((a - b) * (c - d));
			
			//Display all values shown and the calculation
			resp.getWriter().println("A = " + A);
			resp.getWriter().println("\nB = " + B);
			resp.getWriter().println("\nC = " + C);
			resp.getWriter().println("\nD = " + D);
			
			resp.getWriter().println("\n\n( "+A+" - "+B+" ) * ( "+C+" - "+D+") = "+answer+"");
		}
	}
}
