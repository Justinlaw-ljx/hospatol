package com.action;

import java.util.List;
import java.util.Map;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.model.TGongfei;
import com.model.TUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport
{
    private int userId;
	private String userName;
	private String userPw;
	private String userRealname;
	private String userTel;
	private String userEmail;
	private String newUserPw;
	
	private int userType;
	
	private String message;
	private String path;
	
	private TUserDAO userDAO;
	
/*	public String userManage()
	{
		//List userList=userDAO.findAll();
		//Map.request=(Map)ServletActionContext.getContext().get("request");
		//request.put("userList",userList);
		Map session=ActionContext.getContext().getSession();
		
		System.out.println(((TUser)session.get("user")).getUserName());
		//System.out.println(userList);
		return ActionSupport.SUCCESS;
	}*/
	   public String userManage()
	   {
		Map session=ActionContext.getContext().getSession();
		String Name=((TUser)session.get("user")).getUserName();
		System.out.println(((TUser)session.get("user")).getUserName());
			 //Map session= (Map)ServletActionContext.getContext().get("request");
			//String Name=(String) session.getUserName("user");
			//System.out.println(session);
		  // System.out.print(userName);
		   String sql="from TUser t where t.userName like '%"+Name.trim()+"%'";
		   List userList=userDAO.getHibernateTemplate().find(sql);
		   System.out.println(userList.size());
		   Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("userList", userList);
			return ActionSupport.SUCCESS;
	   }
	
	public String userEdit()
	{
		    TUser user=userDAO.findById(userId);
		    Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("user", user);
			return ActionSupport.SUCCESS;
	}
	
	public String userEdit1()
	{
		TUser user=userDAO.findById(userId);
		 user.setUserRealname(userRealname);
		 user.setUserTel(userTel);
		 user.setUserEmail(userEmail);
		
		 userDAO.getHibernateTemplate().update(user);
		    this.setMessage("编辑成功");
			this.setPath("userManage.action");
			return "succeed";
	}
	
	public String adminLogin()
	{
		String sql="from TUser where userName=? and userPw=? and userType=0";
		Object[] con={userName,userPw};
		List userList=userDAO.getHibernateTemplate().find(sql,con);
		if(userList.size()==0)
		{
			Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("error", "用户名或密码错误");
    		return ActionSupport.ERROR;
		}
		else 
		{
			 Map session= ServletActionContext.getContext().getSession();
			 TUser user=(TUser)userList.get(0);
			 session.put("user", user);
			 return ActionSupport.SUCCESS;
		}
	}
	
	public String userReg()
	{		
		/*TUser user=new TUser();
		user.setUserName(userName);
		String users=user.getUserName();
		String sql="from TUser where userName=? ";
		Object[] con={userName};
		List userList=userDAO.getHibernateTemplate().find(sql,con);
		if(userList.size()==0||userList==users)
		{	
			
		}*/
		TUser user=new TUser();
		user.setUserName(userName);
		user.setUserPw(userPw);
		user.setUserType(1);
		user.setUserRealname(userRealname);
		user.setUserEmail(userEmail);
		user.setUserTel(userTel);
		userDAO.save(user);

		
		
		this.setMessage("注册成功");
		this.setPath("/admin/login.jsp");
        return "succeed";
	}
	
	public String userLogin()
	{
		String sql="from TUser where userName=? and userPw=? and userType=1";
		Object[] con={userName,userPw};
		List userList=userDAO.getHibernateTemplate().find(sql,con);
		if(userList.size()==0)
		{
			Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("error", "用户名或密码错误");
    		return ActionSupport.ERROR;
		}
		else
		{
			 Map session= ServletActionContext.getContext().getSession();
			 TUser user=(TUser)userList.get(0);
			 session.put("user", user);
			 return ActionSupport.SUCCESS;
		}
	}
	
	
	public String userPwEdit()
	{
		Map session=ActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		user.setUserPw(newUserPw);
		userDAO.getHibernateTemplate().update(user);
		
		this.setMessage("修改成功");
		this.setPath("/admin/anquan/userPwEdit.jsp");
		return "succeed";
	}
	
	
	
	

	

	
	
	
	

	public int getUserId()
	{
		return userId;
	}


	public void setUserId(int userId)
	{
		this.userId = userId;
	}


	public String getUserEmail()
	{
		return userEmail;
	}


	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}


	public String getUserRealname()
	{
		return userRealname;
	}


	public void setUserRealname(String userRealname)
	{
		this.userRealname = userRealname;
	}


	public String getUserTel()
	{
		return userTel;
	}


	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}


	public String getUserName()
	{
		return userName;
	}




	public String getNewUserPw()
	{
		return newUserPw;
	}



	public void setNewUserPw(String newUserPw)
	{
		this.newUserPw = newUserPw;
	}



	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public TUserDAO getUserDAO()
	{
		return userDAO;
	}


	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message)
	{
		this.message = message;
	}


	public String getPath()
	{
		return path;
	}


	public void setPath(String path)
	{
		this.path = path;
	}


	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}


	public String getUserPw()
	{
		return userPw;
	}

	public void setUserPw(String userPw)
	{
		this.userPw = userPw;
	}

	public int getUserType()
	{
		return userType;
	}

	public void setUserType(int userType)
	{
		this.userType = userType;
	}
	
}
