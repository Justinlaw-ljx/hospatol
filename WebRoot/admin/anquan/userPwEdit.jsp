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
       function check1()
       {
          var userPw=document.form1.userPw.value;
          var zhengquePw='<s:property value="#session.user.userPw"/>';
          if(userPw!=zhengquePw)
          {
             alert("旧密码输入不正确");
             return ;
          }
          
          var newUserPw=document.form1.newUserPw.value;
          if(newUserPw=="")
          {
              alert("新密码不能为空");
              return ;
          }
          
          document.form1.submit();
       }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">密码修改</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/userPwEdit.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">旧密码:</td>
				             <td><input type="text" name="userPw" /></td>
				        </tr>
				        <tr>
				             <td align="center">新密码:</td>
				             <td><input type="text" name="newUserPw" /></td>
				        </tr>
				        <tr>
				             <td colspan="2"><input type="button" value="确定" onclick="check1()"/><input  type="reset" value="取消"/></td>
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
