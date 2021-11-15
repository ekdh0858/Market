package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5
 */
@WebServlet("/ex5")
public class Ex5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("name");		
		PrintWriter out = response.getWriter();		
		
		String clientIp = request.getRemoteAddr();
		String adminIp = "192.168.10.11";
		if(clientIp.equals(adminIp) ) {
			out.print("<html>");
			out.print("<head>");
			out.print("		<title>ex</title>");
			out.print("</head>");
			out.print("<body>");		
			try{
				int age = Integer.parseInt(request.getParameter("age"));					
				
				if(name==null) {
					out.print("		<h1>name 파라미터를 넣어서 호출해야 합니다.</h1>");
				}else {
					out.print("		<h1>클라이언트가 전달한 파라미터</h1>");
					out.print("		<p>name = "+ name +"</p>");
					out.print("		<p>age = "+ age +"</p>");
				}		
				
			}
			catch(NumberFormatException e) {
				//age 파라미터를 넣어서 호출해야 합니다.					
				out.print("<h1>age파라미터를 넣어서 호출해야 합니다.</h1>");			
			}finally {
				//스트림을 닫는 코드는 항상! finally 안에 넣어야함
				out.print("</body>");
				out.print("</html>");
				out.close();
			}
		}else{
			//이 서블릿으로 접근한 컴퓨터가 내 컴퓨터가 아닐 때
			out.print("<h1>허용된 관리자만 접근가능합니다.</h1>");
		}				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
