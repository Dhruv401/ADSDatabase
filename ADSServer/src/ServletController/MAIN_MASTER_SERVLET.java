package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import hibernate_java_files.ManageMain_Master;





@WebServlet(asyncSupported = true, urlPatterns = { "/MAIN_MASTER_SERVLET" })
public class MAIN_MASTER_SERVLET extends HttpServlet{
	private static final long serialVersionUID = 1L;
	/**
     * Default constructor. 
     */
    public MAIN_MASTER_SERVLET() {
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
		// TODO Auto-generated method stub
		
		response.getWriter();
		String userid = request.getParameter("userId");
		
		String password = request.getParameter("password");
		
	//	String Repassword = request.getParameter("Repassword");
		
		String userType = request.getParameter("userType");
		
		
		String email = request.getParameter("email");
		
		String fname = request.getParameter("fname");
		
		String lname = request.getParameter("lname");
		
		
		request.setAttribute("EMAIL", email);
		
		
		request.setAttribute("FNAME", fname);
	
		
		request.setAttribute("LNAME", lname);
		
		try{
			
			ManageMain_Master m =new  ManageMain_Master();
			
			m.adduser(userid, password, userType, email, fname, lname);
			
			if(userType.equals("donor"))
			{
			
				 RequestDispatcher rd = request.getRequestDispatcher("Donor.jsp");
				 rd.forward(request, response);
				
				
			// response.sendRedirect("Donor.jsp");
			 
			// JOptionPane.showMessageDialog (null, "successfully registered", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
			 
			 
			}
			else
			{
				
				 RequestDispatcher rd = request.getRequestDispatcher("Organization.jsp");
				 rd.forward(request, response);
				
			//	JOptionPane.showMessageDialog (null, "successfully registered", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
			//	response.sendRedirect("Organization.jsp");
				
			}
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
