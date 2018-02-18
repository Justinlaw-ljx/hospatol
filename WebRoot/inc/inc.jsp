<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <script type="text/javascript">
         function question()
         {
                 <s:if test="#session.user==null">
                     alert("请先登录");
                 </s:if>
                 
                 <s:else>
				     var s="<%=path %>/questionAddPre.action";
				    window.location.href=s;
                 </s:else>
         }
         
         function zhongxin()
         {
                 <s:if test="#session.user==null">
                     alert("请先登录");
                 </s:if>
                 
                 <s:else>
				     var s="<%=path %>/userinfo.action";
				    window.location.href=s;
                 </s:else>
         }
         
         function seach()
          {
              var s=document.getElementById("fileName").value;
              var url="<%=path %>/goujianSeach.action?fileName="+s;
              url=encodeURI(url); 
              url=encodeURI(url); 
              window.location.href=url;
          }
          
          
          function login()
          {
               document.form1.userName.value=document.getElementById("userName1").value;
               document.form1.userPw.value=document.getElementById("userPw1").value;
               document.form1.submit();
          }
          
          function admin()
          {
              var url="<%=path %>/admin/login.jsp";
              window.open(url);
          }
      </script>
  </head>
  
  <body>
        <A href="<%=path %>/index.html">首 页</A> &nbsp;&nbsp;&nbsp;&nbsp;
		<%--<a href="#" onclick="fabu()">发布构件</a> 
		<a href="#" onclick="fabuxuqiu()">发布构件需求</a> --%>
		<%--<input type="text" name="fileName" id="fileName"><a href="#" onclick="seach()" target="">搜索</a>--%>
		<s:if test="#session.user==null">
		      用户名：<input type="text" name="userName1" id="userName1" size="6"/>
			  密码：&nbsp;&nbsp;&nbsp;<input type="password" id="userPw1" name="userPw1" size="6"/>
			 <input class="ButtonCss" type="button" onclick="login()" value="登陆"/><FONT color="red"><s:property value="#request.error"/></FONT>&nbsp;&nbsp;
		</s:if>
		<s:else>
		     欢迎您：<s:property value="#session.user.userName"/> &nbsp;&nbsp;&nbsp;&nbsp;
		</s:else>
		
		
		<a href="<%=path %>/user_reg.jsp">没有注册？</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="#" onclick="admin()">后台管理</a> &nbsp;&nbsp;&nbsp;&nbsp;
		
		
		
		<form action="<%=path %>/userLogin.action" name="form1" method="post" style="display: none;">
		    用户名：<input type="text" name="userName" size="12"/><br><br>
		    密码：&nbsp;&nbsp;&nbsp;<input type="password" name="userPw" size="14"/><br><br>
		    <input class="ButtonCss" type="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    </form>
	    
	    
  </body>
</html>
