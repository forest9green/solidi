package com.mypage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyPageMainServlet
 */
@WebServlet("/myPage/main")
public class MyPageMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageMainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		List<String> pCodes=new ArrayList<>();
		List<String> recentP=new ArrayList<>();
		if(cookies!=null) {
			for(Cookie c : cookies) {
				if(c.getName().substring(0,1).equals("P")) {
					pCodes.add(c.getValue());
				}
			}
			System.out.println(pCodes.size());
			if(pCodes.size()<4) {
				for(int i=0;i<pCodes.size();i++) {
					System.out.println(pCodes.get(2));
					recentP.add(pCodes.get(pCodes.size()-i));
				}
			}else {
				for(int i=0;i<4;i++) {
					recentP.add(pCodes.get(pCodes.size()-i));
				}
			}
		}
		
		request.setAttribute("recentP", recentP);
		request.getRequestDispatcher("/views/myPage/myPageMain.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
