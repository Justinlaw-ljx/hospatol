<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'rigst.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
<body background="/hospatol/images/zhucebeijin2.jpg"> 
    <h3>请正确填写下列注册信息，我们将妥善保存 </h3>
    <form name=ThisForm action="<%=path %>/userReg.action" method="POST">
    <table border=1 ;"   align="left" width="350" height="230">
   <tr><td style="text-align:center"><span class="STYLE13">用户名:</span></td><td> <input type="text" name="userName"><br>(只支持输入英文和数字)</td></tr>
   <tr><td style="text-align:center"><span class="STYLE13">用户真名:</span></td><td>   <input type="text" name="userRealname"></td></tr>
    <tr><td style="text-align:center"><span class="STYLE13">密码:</span></td><td>   <input type="password" name="userPw"></td></tr>
<!--      <tr><td style="text-align:center"><span class="STYLE13">再次输入密码:</span></td><td>   <input type="password" name="userPw"></td></tr>  -->
    <tr><td style="text-align:center"><span class="STYLE13">联系电话:</span></td><td><input type="text" name="userTel" onKeypress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;"></td></tr>
    <tr><td style="text-align:center"><span class="STYLE13">联系邮箱:</span></td><td><input type="text" name="userEmail"></td></tr>
    <tr><td style="text-align:right"> <input type="submit" value="注册"></td><td><input type="button" onclick="window.location.href='/hospatol/admin/login.jsp'" value="返回"></td></tr>
    </table>
    </form>
  </body>
</html>