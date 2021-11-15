package chapter5;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Chap5Ex1 extends HttpServlet {
	private int idLenght;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 호출!");
		
		idLenght = Integer.parseInt(getInitParameter("ID_LENGTH"));
		
		System.out.println("idLength = "+idLenght);
	}
//	public void init() throws ServletException{
//		System.out.println("서블릿이 생성되었음!");
//	}
	// ServletConfig객체 -> 이 서블릿은 정보를 담고 있는 객체
	// 					   web.xml에 설정한 서블릿의 정보를 가져올 수 있음
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		// init-param 태그가 전달해주는 상수를 doGet,doPost 등의 메서드를 활용하려면 
//		// 멤버 변수를 사용하면 됨
//		
//		// 서블릿 설정에 적어둔 init-param 태그가 전달해주는 값을 꺼내는 메서드 ->getInitParameter()
//		String idLength = config.getInitParameter("ID_LENGTH");
//		
//		this.idLenght = Integer.parseInt(idLength);
//		System.out.println("idLength = "+idLength);
//	}

	
}
