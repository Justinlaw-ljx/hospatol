package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.dao.TYaopinDAO;
import com.model.TYaopin;
import com.opensymphony.xwork2.ActionSupport;

public class YaopinAction extends ActionSupport
{
	private int yaopinId;
	private String yaopinName;
	private String yaopinDanwei;
	private String yaopinJiege;
	private String yaopinShuliang;
	private String yaopinUser;
	private String yaopinRukudate;
	
	private String message;
	private String path;
	private TYaopinDAO yaopinDAO;
	
	
	
   public String yaopinManage()
   {
	   List yaopinList=yaopinDAO.findAll();
	   Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yaopinList", yaopinList);
		return ActionSupport.SUCCESS;
   }
   
   
   public String yaopinSearch()
   {
	   System.out.println(yaopinName);
	   String sql="from TYaopin t where t.yaopinName like '%"+yaopinName.trim()+"%'";
	   List yaopinList=yaopinDAO.getHibernateTemplate().find(sql);
	   System.out.println(yaopinList.size());
	   Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yaopinList", yaopinList);
		return ActionSupport.SUCCESS;
   }
   
   
   public String yaopinEdit()
   {
	    TYaopin yaopin=yaopinDAO.findById(yaopinId);
	    Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yaopin", yaopin);
		return ActionSupport.SUCCESS;
   }
   
   
	
	
   public String yaopinAdd()
   {
	   TYaopin yaopin=new TYaopin();
	   yaopin.setYaopinDanwei(yaopinDanwei);
	   yaopin.setYaopinJiege(yaopinJiege);
	   yaopin.setYaopinName(yaopinName);
	   yaopin.setYaopinRukudate(yaopinRukudate);
	   yaopin.setYaopinShuliang(yaopinShuliang);
	   yaopin.setYaopinUser(yaopinUser);
	   
	    yaopinDAO.save(yaopin);
	    this.setMessage("成功入库");
		this.setPath("yaopinManage.action");
		return "succeed";
   }
   
   
   public String yaopinEdit1()
   {
	   TYaopin yaopin=yaopinDAO.findById(yaopinId);
	   yaopin.setYaopinDanwei(yaopinDanwei);
	   yaopin.setYaopinJiege(yaopinJiege);
	   yaopin.setYaopinName(yaopinName);
	   yaopin.setYaopinRukudate(yaopinRukudate);
	   yaopin.setYaopinShuliang(yaopinShuliang);
	   yaopin.setYaopinUser(yaopinUser);
	   
	    yaopinDAO.getHibernateTemplate().update(yaopin);
	    this.setMessage("编辑入库");
		this.setPath("yaopinManage.action");
		return "succeed";
   }
	
   
   public String yaopinDel()
   {
	   yaopinDAO.delete(yaopinDAO.findById(yaopinId));
	   this.setMessage("删除入库");
		this.setPath("yaopinManage.action");
		return "succeed";
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
	public String getYaopinDanwei()
	{
		return yaopinDanwei;
	}
	public void setYaopinDanwei(String yaopinDanwei)
	{
		this.yaopinDanwei = yaopinDanwei;
	}
	public TYaopinDAO getYaopinDAO()
	{
		return yaopinDAO;
	}
	public void setYaopinDAO(TYaopinDAO yaopinDAO)
	{
		this.yaopinDAO = yaopinDAO;
	}
	public int getYaopinId()
	{
		return yaopinId;
	}
	public void setYaopinId(int yaopinId)
	{
		this.yaopinId = yaopinId;
	}
	public String getYaopinJiege()
	{
		return yaopinJiege;
	}
	public void setYaopinJiege(String yaopinJiege)
	{
		this.yaopinJiege = yaopinJiege;
	}
	public String getYaopinName()
	{
		return yaopinName;
	}
	public void setYaopinName(String yaopinName)
	{
		this.yaopinName = yaopinName;
	}
	public String getYaopinRukudate()
	{
		return yaopinRukudate;
	}
	public void setYaopinRukudate(String yaopinRukudate)
	{
		this.yaopinRukudate = yaopinRukudate;
	}
	public String getYaopinShuliang()
	{
		return yaopinShuliang;
	}
	public void setYaopinShuliang(String yaopinShuliang)
	{
		this.yaopinShuliang = yaopinShuliang;
	}
	public String getYaopinUser()
	{
		return yaopinUser;
	}
	public void setYaopinUser(String yaopinUser)
	{
		this.yaopinUser = yaopinUser;
	}
	
}
