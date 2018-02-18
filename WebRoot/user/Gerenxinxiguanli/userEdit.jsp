<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=path %>/css/Common.css" rel="stylesheet" type="text/css" />
    <link href="<%=path %>/css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">个人信息修改</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/userEdit1.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">真实姓名:</td>
				             <td><input type="text" name="userRealname" value="<s:property value="#request.user.userRealname"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">电话号码:</td>
				             <td><input type="text" name="userTel" value="<s:property value="#request.user.userTel"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">邮箱地址:</td>
				             <td><input type="text" name="userEmail" value="<s:property value="#request.user.userEmail"/>"/></td>
				        </tr>				        
				        <tr>
				             <input type="hidden" name="userId" value="<s:property value="#request.user.userId"/>"/>
				             <td colspan="2"><input type="submit" value="确定"/><input  type="button" onclick="window.location.href='/hospatol/admin/right.jsp'" value="取消"/></td>
				        </tr>
				    </table>
				</form>
				<ul>
					<li><a href="" title="">&nbsp;</a> </li>
					<li><a href="" title="">&nbsp;</a> </li>
				</ul>
			</div>
        </div>
  </body>
</html>

