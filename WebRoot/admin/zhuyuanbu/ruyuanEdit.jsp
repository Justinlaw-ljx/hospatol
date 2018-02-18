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
				<div class="BoxHeader-center MarginTop10">入院修改</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/ruyuanEdit1.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">病人姓名:</td>
				             <td><input type="text" name="ruyuanBinghaoName" value="<s:property value="#request.ruyuan.ruyuanBinghaoName"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">病人年龄:</td>
				             <td><input type="text" name="ruyuanBinghaoAge" value="<s:property value="#request.ruyuan.ruyuanBinghaoAge"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">联系方式:</td>
				             <td><input type="text" name="ruyuanBinghaoTel" value="<s:property value="#request.ruyuan.ruyuanBinghaoTel"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">病人性别:</td>
				             <td><input type="text" name="ruyuanBinghaoSex" value="<s:property value="#request.ruyuan.ruyuanBinghaoSex"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">住院押金:</td>
				             <td><input type="text" name="ruyuanYajin" value="<s:property value="#request.ruyuan.ruyuanYajin"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">入院时间:</td>
				             <td><input type="text" name="ruyuanDate" value="<s:property value="#request.ruyuan.ruyuanDate"/>"/></td>
				        </tr>
				        
				        <tr>
				             <input type="hidden" name="ruyuanId" value="<s:property value="#request.ruyuan.ruyuanId"/>"/>
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
