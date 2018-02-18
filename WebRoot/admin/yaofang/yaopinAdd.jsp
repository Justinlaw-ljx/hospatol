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
       function check()
       {
	          if(document.form1.yaopinName.value=="")
	          {
	              alert("请输入药品名称");
	              return false;
	          }
             
              if(document.form1.yaopinDanwei.value=="")
              {
                  alert("请输入药品单价");
                  return false;
              }
              if(document.form1.yaopinJiege.value=="")
              {
                  alert("请输入药品单位");
                  return false;
              }
              if(document.form1.yaopinShuliang.value=="")
              {
                  alert("请输入入库数量");
                  return false;
              }
              if(document.form1.yaopinUser.value=="")
              {
                  alert("请输入经办人");
                  return false;
              }
              if(document.form1.yaopinRukudate.value=="")
              {
                  alert("请输入入库时间");
                  return false;
              }
              document.form1.submit();
          }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">药品入库</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/yaopinAdd.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">药品名称:</td>
				             <td><input type="text" name="yaopinName" /></td>
				        </tr>
				        <tr>
				             <td align="center">单位:</td>
				             <td><input type="text" name="yaopinDanwei" /></td>
				        </tr>
				        <tr>
				             <td align="center">单价:</td>
				             <td><input type="text" name="yaopinJiege" /></td>
				        </tr>
				        <tr>
				             <td align="center">入库数量:</td>
				             <td><input type="text" name="yaopinShuliang" /></td>
				        </tr>
				        <tr>
				             <td align="center">经办人:</td>
				             <td><input type="text" name="yaopinUser" /></td>
				        </tr>
				        <tr>
				             <td align="center">入库时间:</td>
				             <td><input type="text" name="yaopinRukudate" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>"/></td>
				        </tr>
				        
				        <tr>
				             <td colspan="2"><input type="button" value="确定" onclick="check()"/><input  type="reset" value="取消"/></td>
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
