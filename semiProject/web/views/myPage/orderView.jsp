<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pageBar=(String)request.getParameter("pageBar");
%>    
<%@ include file="/views/common/header.jsp"%>

<section>
    <div id="order_box" class="box">
        <p><h2 class="pe">ORDER</h2></p>
        <div id="order_table_box">
            <table id="order_table" class="pa" border=1>
                <thead>
                    <tr>
                        <th>상품 정보</th>
                        <th width=60>수량</th>
                        <th width=110 >주문 처리 상태</th>
                        <th width=110>취소/교환/반품</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                    	<td colspan="4"><b>주문일자[주문번호]</b> : 0000/00/00[00000000-0] / <b>결제 금액</b> : 000,000원</td>
                    </tr>
                    <tr>
                        <td>
                            <div class="pInfoDiv">
                                <img> 가구명
                            </div>
                        </td>
                        <td></td>
                        <td>
                            <ul class="order_detail_btn">
                                <li>배송 완료</li>
                                <li><button>배송 조회</button></li><!--상태가 배송 시작일 때부터 활성화-->
                                <li><button>후기 작성</button></li><!--상태가 배송 완료일 때부터 활성화-->
                            </ul>
                        </td>
                        <td>
                            <ul class="order_detail_btn">
                                <li><button>교환/반품</button></li><!--상태가 배송 완료일 때부터 활성화-->
                                <li><button>주문 취소</button></li><!--상태가 배송 시작 전일 때만 활성화-->
                            </ul>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div id="o_pagebar" class="pagebar">
            <%=pageBar %>
            <!--출력할 데이터 개수에 따라 페이지가 추가되도록 함-->
        </div>
    </div>
</section>
<!--section에 적용될 style, script 내용 넣어주세요-->
<style>
    #order_box{
        width:1000px;
        height:800px;
        margin:50px auto;
    }
    #order_box>p+h2{
        font-size: 30px;
    }
    #order_table{
        margin:30px 0 10px 0;
        width:1000px;
        text-align: center;
        border-collapse: collapse;
        border-left: none;
        border-right: none;
    }
    #order_table tr{
        height:40px;
    }
    .pInfoDiv{
        display:flex;
        align-items: center;
    }
    .pInfoDiv>img{
        width:100px;
        height:100px;
        border:1px gray solid;
        margin:10px;
    }
    .order_detail_btn{
        list-style-type: none;
        padding:0;
        margin:6px 0 6px 0;
    }
    .order_detail_btn:first-child{
        margin:5px;
        font-size:14px;
        font-weight: 300;
    }
    button{
        border: 1px gray solid;
        text-align: center;
        background-color: white;
        font-family: "Noto Sans KR";
        font-weight: 300;
        margin:5px;
        padding:4px;
        font-size:14px;
    }
    #order_box>p+h2{
        font-size: 30px;
    }
    /*pageBar 디자인*/
    .pagebar{
        margin: 50px auto;
        display:flex;
        justify-content: center;
    }
    .pagebar>span, .pagebar>a{
        margin:0 6px 0 6px;
    }
    .pagebar>a{
        text-decoration: none;
        color:black;
    }
    .pagebar>span{
        color:rgba(123, 209, 159);
    }
    .pagebar>a:hover{
        color:rgba(123, 209, 159);
    }
    body{
		margin:0px;
	}
	button:hover{
		cursor:pointer;
	}
</style>
<script></script>

<%@ include file="/views/common/footer.jsp"%>