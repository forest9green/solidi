package com.order.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.order.model.service.OrderService;
import com.order.model.vo.OrderList;
import com.wish.model.service.WishListService;
import com.wish.model.vo.WishProduct;

/**
 * Servlet implementation class OrderViewServlet
 */
@WebServlet("/myPage/orderView")
public class OrderViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId=request.getParameter("userId");
		
		int cPage;
		int numPerPage=10;
		try {
			cPage=Integer.parseInt(request.getParameter("cPage"));
		}catch(NumberFormatException e) {
			cPage=1;
		}
		
		//1. 아이디로 정보 가져오기(주문번호, 결제금액, 주문일, 상품코드, 수량, 상태)
		Map<String, List<OrderList>> oList=new OrderService().selectOrder(userId);
		
//		int totalData=new OrderService().selectOrderCount(userId);
//		int totalPage=(int)Math.ceil((double)totalData/numPerPage);
		
		int pageBarSize=10;
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd=pageNo+pageBarSize-1;
		
		String pageBar="";
//		while(!(pageNo>pageEnd||pageNo>totalPage)) {
//			if(pageNo==cPage) {
//				pageBar+="<span>"+pageNo+"</span>";
//			}else {
//				pageBar+="<a href='"+request.getContextPath()+"/myPage/orderView?userId="+userId+"&cPage="+pageNo+"'>"+pageNo+"</a>";
//			}
//			pageNo++;
//		}

		request.setAttribute("pageBar", pageBar);
		request.setAttribute("oList", oList);
		
		request.getRequestDispatcher("/views/myPage/orderView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
