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
				<div class="BoxHeader-center MarginTop10">公费报销</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/gongfeiEdit1.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">公费事由:</td>
				             <td><input type="text" name="gongfeiShiyou" value="<s:property value="#request.gongfei.gongfeiShiyou"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">报销金额:</td>
				             <td><input type="text" name="gongfeiJinE" value="<s:property value="#request.gongfei.gongfeiJinE"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">费用产生日期:</td>
				             <td><input type="text" name="gongfeiRiqi" value="<s:property value="#request.gongfei.gongfeiRiqi"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">报销人:</td>
				             <td><input type="text" name="gongfeiOne1" value="<s:property value="#request.gongfei.gongfeiOne1"/>"/></td>
				        </tr>
				        <tr>
				             <input type="hidden" name="gongfieId" value="<s:property value="#request.gongfei.gongfieId"/>"/>
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
