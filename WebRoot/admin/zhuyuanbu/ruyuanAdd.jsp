<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:directive.page import="java.text.SimpleDateFormat"/>
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
    <script type="text/javascript">
       function check1()
       {
         
          
          document.form1.submit();
       }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">入院登记</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/ruyuanAdd.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">病人姓名:</td>
				             <td><input type="text" name="ruyuanBinghaoName" /></td>
				        </tr>
				        <tr>
				             <td align="center">病人年龄:</td>
				             <td><input type="text" name="ruyuanBinghaoAge" /></td>
				        </tr>
				        <tr>
				             <td align="center">联系方式:</td>
				             <td><input type="text" name="ruyuanBinghaoTel" /></td>
				        </tr>
				        <tr>
				             <td align="center">病人性别:</td>
				             <td><input type="text" name="ruyuanBinghaoSex" /></td>
				        </tr>
				        <tr>
				             <td align="center">住院押金:</td>
				             <td><input type="text" name="ruyuanYajin" /></td>
				        </tr>
				        <tr>
				             <td align="center">入院时间:</td>
				             <td><input type="text" name="ruyuanDate" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>"/></td>
				        </tr>
				        
				        <tr>
				             <td colspan="2"><input type="submit" value="确定"/><input  type="reset" value="取消"/></td>
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
