package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex2
 */
@WebServlet("/ex2")
public class ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라인언트가 요청한 결과를 만들어 낸다.
		// 서블릿이나 DB나 자바 등을 활용
		// 서블릿에서 결과를 만들면 결과에 맞는 페이지를 response
		
		//클라이언트가 요청한 결과에 맞게 페이지를 구성해서 응답한다.
		//HTML, CSS, Js/JSP를 활용
		
		
		// sendRedirect() -> 지정한 경로로 이동해 라고 클라이언트에게 명령을 내리는 응답
		// 경로는 /부터 시작하고 경로의 맨 앞에 http://서버주소:포트번호 가 생략된 상태
		// 이응답을 하게 되면 클라이언트의 브라우저 URL도 같이 바뀌는 특징
		response.sendRedirect("/Market/chapter3/rainbow.html");
		
		
		
		
		// 이 아래에 있는 코드는 전부 주석 처리
		/*
		PrintWriter outputstream = response.getWriter();
		
		outputstream.print("<html>");
		outputstream.print("<head>");
		outputstream.print("	<title>Ex2</title>");
		outputstream.print("	<style>");
		outputstream.print("	div {width:50px; height:50px; display:inline-block");
		outputstream.print("	.red{background-color: red}");
		outputstream.print("	.orange{background-color: orange}");
		outputstream.print("	.yellow{background-color: yellow}");
		outputstream.print("	.green{background-color: green}");
		outputstream.print("	.blue{background-color: blue}");
		outputstream.print("	.navy{background-color: navy}");
		outputstream.print("	.purple{background-color: purple}");
		outputstream.print("	</style>");
		outputstream.print("</head>");
		outputstream.print("<body>");
		outputstream.print("	<div class=\"red\"></div>");
		outputstream.print("	<div class=\"orange\"></div>");
		outputstream.print("	<div class=\"yellow\"></div>");
		outputstream.print("	<div class=\"green\"></div>");
		outputstream.print("	<div class=\"blue\"></div>");
		outputstream.print("	<div class=\"navy\"></div>");
		outputstream.print("	<div class=\"purple\"></div>");
		outputstream.print("</body>");
		outputstream.print("</html>");
		
		outputstream.close();
		*/
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
