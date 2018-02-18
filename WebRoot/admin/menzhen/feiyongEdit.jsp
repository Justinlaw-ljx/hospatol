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
          var feiyongMoney=document.form1.feiyongMoney.value;
          if(feiyongMoney=="")
          {
              alert("请输入费用金额");
              return;
          }
          
          
          document.form1.submit();
       }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">费用记账</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/feiyongEdit1.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">收费日期:</td>
				            <td><input type="text" name="feiyongDate" value="<s:property value="#request.feiyong.feiyongDate"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">费用名称:</td>
				             <td><input type="text" name="feiyongName" value="<s:property value="#request.feiyong.feiyongName"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">费用金额</td>
				             <td><input type="text" name="feiyongMoney" value="<s:property value="#request.feiyong.feiyongMoney"/>" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/></td>
				        </tr>
				        <tr>
				             <td align="center">病人:</td>
				             <td>
				                 <input type="text" name="feiyongBingrenName" value="<s:property value="#request.feiyong.feiyongBingrenName"/>"/>
                             </td>
				        </tr>
				        <tr>
				             <input type="hidden" name="feiyongId" value="<s:property value="#request.feiyong.feiyongId"/>"/>
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
