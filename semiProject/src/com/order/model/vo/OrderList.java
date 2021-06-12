package com.order.model.vo;

import java.util.Date;

public class OrderList {
	
	private int oPayment;
	private Date orderDate;
	private String pCode;
	private int oAmount;
	private String oState;
	
	public OrderList() {
		// TODO Auto-generated constructor stub
	}

	public OrderList(int oPayment, Date orderDate, String pCode, int oAmount, String oState) {
		super();
		this.oPayment = oPayment;
		this.orderDate = orderDate;
		this.pCode = pCode;
		this.oAmount = oAmount;
		this.oState = oState;
	}

	public int getoPayment() {
		return oPayment;
	}

	public void setoPayment(int oPayment) {
		this.oPayment = oPayment;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public int getoAmount() {
		return oAmount;
	}

	public void setoAmount(int oAmount) {
		this.oAmount = oAmount;
	}

	public String getoState() {
		return oState;
	}

	public void setoState(String oState) {
		this.oState = oState;
	}

	@Override
	public String toString() {
		return "OrderList [oPayment=" + oPayment + ", orderDate=" + orderDate + ", pCode="
				+ pCode + ", oAmount=" + oAmount + ", oState=" + oState + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + oAmount;
		result = prime * result + oPayment;
		result = prime * result + ((oState == null) ? 0 : oState.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((pCode == null) ? 0 : pCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderList other = (OrderList) obj;
		if (oAmount != other.oAmount)
			return false;
		if (oPayment != other.oPayment)
			return false;
		if (oState == null) {
			if (other.oState != null)
				return false;
		} else if (!oState.equals(other.oState))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (pCode == null) {
			if (other.pCode != null)
				return false;
		} else if (!pCode.equals(other.pCode))
			return false;
		return true;
	}

}
