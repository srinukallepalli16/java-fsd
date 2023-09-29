import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.util.Scanner;
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Scanner input=new Scanner(System.in);
		String uname = request.getParameter("txtUname");
		String pwd = request.getParameter("txtPwd");
		
		if(uname.equals("srinivas") && pwd.equals("srinivas@33"))
		{
			
			response.sendRedirect("Welcome.html");
		}
		else
		{
			response.sendRedirect("Error.html");			
		}
		
	}

}
