package com.order.model.service;

import static com.common.JDBCTemplate.close;
import static com.common.JDBCTemplate.commit;
import static com.common.JDBCTemplate.getConnection;
import static com.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.order.model.dao.OrderDao;
import com.order.model.vo.NoBookPay;
import com.order.model.vo.Order;
import com.order.model.vo.OrderList;

public class OrderService {
	
	private OrderDao dao=new OrderDao();
	
	
	public int insertOrder(Order o) {
		Connection conn=getConnection();
		int result=dao.insertOrder(conn,o);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	
	public String selectOrderNo(String userId) {
		Connection conn=getConnection();
		String orderNo=dao.selectOrderNo(conn,userId);
		close(conn);
		return orderNo;
	}
	
	
	public int insertOrderDetail(String orderNo, String pCode, int amount) {
		Connection conn=getConnection();
		int result=dao.insertOrderDetail(conn,orderNo,pCode,amount);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	
	public int insertNoBookPay(String orderNo, String orderName) {
		Connection conn=getConnection();
		int result=dao.insertNoBookPay(conn,orderNo,orderName);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	
	public NoBookPay selectNBP(String orderNo) {
		Connection conn=getConnection();
		NoBookPay nbp=dao.selectNBP(conn,orderNo);
		close(conn);
		return nbp;
	}
	
	
	public int selectTotalPay(String orderNo) {
		Connection conn=getConnection();
		int totalPay=dao.selectTotalPay(conn,orderNo);
		close(conn);
		return totalPay;
	}
	
	
	public Map<String,List<OrderList>> selectOrder(String userId, int cPage, int numPerPage){
		Connection conn=getConnection();
		Map<String,List<OrderList>> oList=dao.selectOrder(conn,userId,cPage,numPerPage);
		close(conn);
		return oList;
	}
	
	
	public int selectOrderCount(String userId) {
		Connection conn=getConnection();
		int result=dao.selectOrderCount(conn,userId);
		close(conn);
		return result;
	}

}
