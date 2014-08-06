

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.fazalcode.bean.EmployeeBean;
import com.java.fazalcode.bean.StudentBean;
import com.java.jsonparser.JsonParser;


@WebServlet("/GsonServlet")
public class GsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GsonServlet() {
        super();
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean sb = new StudentBean();
		sb.setsId("2");
		sb.setsName("Tata");
		
		EmployeeBean eb = new EmployeeBean();
		eb.seteId("5");
		eb.seteName("nataraz");
		
        String student = JsonParser.parseDataToJson(eb);
		response.setContentType("application/json");
		response.getWriter().write(student);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
