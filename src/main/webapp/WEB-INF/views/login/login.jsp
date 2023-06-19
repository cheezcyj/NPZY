<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%-- jsp comment: Html comment가 노출 되지 않음--%>
<!--  html comment: 소스보기에 노출 --> 
 <c:set var="CP" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PCWK_SPRING</title>
<script src="${CP}/resources/js/jquery-3.7.0.js"></script>
<script >
  // jquery == $
  $(document).ready(function(){  //모든 화면이다 로딩이 되면
	   console.log("$(document).ready");
  
	   //jquery 이벤트 감지
	   $("#doLogin").on("click",function(){
		   console.log("doLogin");
		   
       console.log("userId:"+$('#userId').val());
       console.log("passwd:"+$("#passwd").val());
	       
       if(""==$("#userId").val() || 0==$("#userId").val().length){
           alert("아이디를 입력하세요.");
           $('#userId').focus();
           return;
       }
       
       if(""==$("#passwd").val() || 0==$("#passwd").val().length){
           alert("비번을 입력하세요.");
           $('#passwd').focus();
           return;
       }       
       
		   if(confirm('로그인 하시겠습니까?')==false)return;
		   
       $.ajax({
           type: "POST",
           url:"${CP}/login/doLogin.do",
           dataType:"html",
           data:{
        	   userId: $('#userId').val(),
        	   passwd: $("#passwd").val()  
           },
           success:function(data){//통신 성공
        	     //success data:{"msgId":"30","msgContents":"pt99_01가 로그인 되었습니다.","num":0,"totalCnt":0,"pageNo":0,"pageSize":0}
               //JSON.parse() 메서드는 JSON 문자열의 구문을 분석하고, 그 결과에서 JavaScript 값이나 객체를 생성합니다. 
               let paredJSON = JSON.parse(data)
               console.log("paredJSON.msgId:"+paredJSON.msgId);
               //console.log("success data:"+data);
               
               if("1" == paredJSON.msgId || "10" == paredJSON.msgId){
            	   //javascript 메시지 다이얼 로그 
            	   alert(paredJSON.msgContents);
            	   //jquery 커거가 컨트롤로 이동
            	   $('#userId').focus();//userId input에 focuse처리
            	   return;
               }
               
               if("2" == paredJSON.msgId || "20" == paredJSON.msgId ){
                   alert(paredJSON.msgContents);
                   $('#passwd').focus();//userId input에 focuse처리
                   return;
               }              
               
               console.log("paredJSON.msgContents:"+paredJSON.msgContents);
               //로그인 성공
               if("30" == paredJSON.msgId ){
            	     alert(paredJSON.msgContents);
            	     
            	     //javascript 내장 객체: url
            	     window.location.href ="${CP}/user/doRetrieve.do";
               }  
               
           },
           error:function(data){//실패시 처리
               console.log("error:"+data);
           }
         });		   
		   
	   });//--end doLogin---------------------------------------------------------
  
  });//--end document-----------------------------------------------------------
  
</script>
</head>
<body>
  <div>
  <h2>로그인</h2>

  <!-- form ------------------------------------------------------------------->
  <form action="${CP}/login/doLogin.do" method="post">
    <div>
      <label for="userId">아이디</label>
      <input type="text" id="userId" name="userId" maxlength="20">
    </div>
    <div>
      <label for="passwd">비번</label>
      <input type="password" id="passwd" name="passwd" maxlength="100">
    </div>  
    <div>
      <input type="button" value="로그인" id="doLogin" >
    </div>
  </form>
  
  
  <!--// form end ------------------------------------------------------------->
  </div>
</body>
</html>