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
         
          
          document.form1.submit();
       }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">员工录入</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/yuangongEdit1.action" name="form1" method="post">
				    <table align="left" border="0">
				        <tr>
				             <td align="center">姓名:</td>
				             <td><input type="text" name="yuangongName" value="<s:property value="#request.yuangong.yuangongName"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">性别:</td>
				             <td>
                                 <input type="radio" name="yuangongSex" value="nan" checked="checked">男
                                 <input type="radio" name="yuangongSex" value="nv">女
                             </td>
				        </tr>
				        <tr>
				             <td align="center">年龄:</td>
				             <td><input type="text" name="yuangongAge" value="<s:property value="#request.yuangong.yuangongAge"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">联系方式:</td>
				             <td><input type="text" name="yuangongTel" value="<s:property value="#request.yuangong.yuangongTel"/>"/></td>
				        </tr>
				        <tr>
				             <td align="center">职务:</td>
				             <td>
				                  <select name="yuangongZhiwei">
				                      <option value="jizhenyisheng">急诊医生</option>
				                      <option value="menzhenyisheng">门诊医生</option>
				                      <option value="zhuyuanbuzhenyisheng">住院部医生</option>
				                      <option value="jizhenhushi">急诊护士</option>
				                      <option value="menzhenhushi">门诊护士</option>
				                      <option value="zhuyuanbuhushi">住院部护士</option>
				                      <option value="danjia">担架工</option>
				                      <option value="jiexiansheng">接线生</option>
				                  </select>
                             </td>
				        </tr>
				        <tr>
				             <input type="hidden" name="yuangongId" value="<s:property value="#request.yuangong.yuangongId"/>"/>
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
