<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/views/common/header.jsp"%>

<section>
    <div id="order_box" class="box">
        <p><h2 class="pe">ORDER</h2></p>
        <div id="order_table_box">
            <table id="order_table" class="pa" border=1>
                <thead>
                    <tr>
                        <th width=145>주문 일자<br>[주문 번호]</th>
                        <th>상품 정보</th>
                        <th width=50>수량</th>
                        <th width=90>구매 금액</th>
                        <th width=90>배송비</th>
                        <th width=110 >주문 처리 상태</th>
                        <th width=110>취소/교환/반품</th>
                    </tr>
                </thead>
                <tbody>
                    <!--
                        값이 없으면 <tr>보유하고 계신 주문 내역이 없습니다.</tr> 추가
                        값이 있을 경우 주문번호에 대한 상품 갯수를 받아서 첫 tr에 rowspan에 넣고, 그 갯수만큼 tr생성되게 함
                        but 첫 행 제외한 tr들의 첫 td는 없어야 함
                    -->
                    <tr>
                        <td rowspan="3">0000-00-00<br>[00000000-0]</td>
                        <td>
                            <div class="pInfoDiv">
                                <img>가구명
                            </div>
                        </td>
                        <td></td>
                        <td></td>
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
                    <tr>
                        <td>
                            <div class="pInfoDiv">
                                <img>가구명
                            </div>
                        </td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>
                            <ul class="order_detail_btn">
                                <li>배송 완료</li>
                                <li><button>배송 조회</button></li>
                                <li><button>후기 작성</button></li>
                            </ul>
                        </td>
                        <td>
                            <ul class="order_detail_btn">
                                <li><button>교환/반품</button></li>
                                <li><button>주문 취소</button></li>
                            </ul>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="pInfoDiv">
                                <img>가구명
                            </div>
                        </td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>
                            <ul class="order_detail_btn">
                                <li>배송 완료</li>
                                <li><button>배송 조회</button></li>
                                <li><button>후기 작성</button></li>
                            </ul>
                        </td>
                        <td>
                            <ul class="order_detail_btn">
                                <li><button>교환/반품</button></li>
                                <li><button>주문 취소</button></li>
                            </ul>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div id="o_pagebar" class="pagebar">
            <span><a href="">1</a></span>
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
    .pagebar{
        width: 100px;
        margin: 50px auto;
    }
    .pagebar>span{
        margin:0 6px 0 6px;
    }
    .pagebar>span a{
        text-decoration: none;
    }
    .pagebar span>a:hover{
        color:rgba(123, 209, 159, 0.856);
    }
</style>
<script></script>

<%@ include file="/views/common/footer.jsp"%>