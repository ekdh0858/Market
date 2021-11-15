package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap6/ex12")
public class chap6Ex12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public chap6Ex12() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forward 메서드를 사용함녀 제어가 완전히 다른 서블릿, JSP로 넘어가기 때문에
		// 이 서블리셍서 아래의 output stream으로 결과를 response를 하는건 무시됨(아무의미가 없음)
		//무시된다는걸 확인하기 위해서 입력한 코드임
		//그러나 여기서 output stream을 닫아줘야함
		//반드시 close/ output stream을 닫아줘야함
		//output stream을 닫는 시점은 forward 메서드를 호출하고난 다음에 닫아줘야함
		
		response.setContentType("text/plain;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<<첫 번째 서블릿의 실행 결과>>\n");
		
		//RequestDispatcher rd = request.getRequestDispatcher("제어를 받을 다음 서블릿 또는 JSP의 경로");
		RequestDispatcher rd = request.getRequestDispatcher("/chap6/ex13");
		rd.include(request, response);
		
		out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
