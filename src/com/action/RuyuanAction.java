package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TRuyuanDAO;
import com.dao.TUserDAO;
import com.model.TRuyuan;
import com.opensymphony.xwork2.ActionSupport;

public class RuyuanAction extends ActionSupport
{
	private int ruyuanId;
	private String ruyuanBinghaoName;
	private String ruyuanBinghaoAge;
	private String ruyuanBinghaoTel;
	private String ruyuanBinghaoSex;
	private String ruyuanYajin;
	private String ruyuanDate;
	
	
	private String message;
	private String path;
	
	private TRuyuanDAO ruyuanDAO;

	
	
	
	
	
	public String ruyuanAdd()
	{
		TRuyuan ruyuan=new TRuyuan();
		ruyuan.setRuyuanYajin(ruyuanYajin);
		ruyuan.setRuyuanBinghaoAge(ruyuanBinghaoAge);
		ruyuan.setRuyuanBinghaoName(ruyuanBinghaoName);
		ruyuan.setRuyuanBinghaoSex(ruyuanBinghaoSex);
		ruyuan.setRuyuanBinghaoTel(ruyuanBinghaoTel);
		ruyuan.setRuyuanDate(ruyuanDate);
		ruyuanDAO.save(ruyuan);
		this.setMessage("登记成功");
		this.setPath("ruyuanManage.action");
		return "succeed";
	}
	
	
	
	public String ruyuanManage()
	{
		List ruyuanList=ruyuanDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("ruyuanList",ruyuanList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String ruyuanDel()
	{
		ruyuanDAO.delete(ruyuanDAO.findById(ruyuanId));
		this.setMessage("删除成功");
		this.setPath("ruyuanManage.action");
		return "succeed";
	}
	
	public String ruyuanEdit()
	{
		TRuyuan ruyuan=(TRuyuan)ruyuanDAO.findById(ruyuanId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("ruyuan",ruyuan);
		return ActionSupport.SUCCESS;
	}
	
	
	public String ruyuanEdit1()
	{
		TRuyuan ruyuan=(TRuyuan)ruyuanDAO.findById(ruyuanId);
		ruyuan.setRuyuanYajin(ruyuanYajin);
		ruyuan.setRuyuanBinghaoAge(ruyuanBinghaoAge);
		ruyuan.setRuyuanBinghaoName(ruyuanBinghaoName);
		ruyuan.setRuyuanBinghaoSex(ruyuanBinghaoSex);
		ruyuan.setRuyuanBinghaoTel(ruyuanBinghaoTel);
		ruyuan.setRuyuanDate(ruyuanDate);
		ruyuanDAO.getHibernateTemplate().update(ruyuan);
		this.setMessage("修改成功");
		this.setPath("ruyuanManage.action");
		return "succeed";
	}
	
	
	
	public String ruyuanSearch()
	{
		String sql="from TRuyuan t where t.ruyuanBinghaoName like '%"+ruyuanBinghaoName+"%'";
		List ruyuanList=ruyuanDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("ruyuanList",ruyuanList);
		return ActionSupport.SUCCESS;
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

	public String getRuyuanBinghaoAge()
	{
		return ruyuanBinghaoAge;
	}

	public void setRuyuanBinghaoAge(String ruyuanBinghaoAge)
	{
		this.ruyuanBinghaoAge = ruyuanBinghaoAge;
	}

	public String getRuyuanBinghaoName()
	{
		return ruyuanBinghaoName;
	}

	public void setRuyuanBinghaoName(String ruyuanBinghaoName)
	{
		this.ruyuanBinghaoName = ruyuanBinghaoName;
	}

	public String getRuyuanBinghaoSex()
	{
		return ruyuanBinghaoSex;
	}

	public void setRuyuanBinghaoSex(String ruyuanBinghaoSex)
	{
		this.ruyuanBinghaoSex = ruyuanBinghaoSex;
	}

	public String getRuyuanBinghaoTel()
	{
		return ruyuanBinghaoTel;
	}

	public void setRuyuanBinghaoTel(String ruyuanBinghaoTel)
	{
		this.ruyuanBinghaoTel = ruyuanBinghaoTel;
	}

	public TRuyuanDAO getRuyuanDAO()
	{
		return ruyuanDAO;
	}

	public void setRuyuanDAO(TRuyuanDAO ruyuanDAO)
	{
		this.ruyuanDAO = ruyuanDAO;
	}

	public String getRuyuanDate()
	{
		return ruyuanDate;
	}

	public void setRuyuanDate(String ruyuanDate)
	{
		this.ruyuanDate = ruyuanDate;
	}

	public int getRuyuanId()
	{
		return ruyuanId;
	}

	public void setRuyuanId(int ruyuanId)
	{
		this.ruyuanId = ruyuanId;
	}

	public String getRuyuanYajin()
	{
		return ruyuanYajin;
	}

	public void setRuyuanYajin(String ruyuanYajin)
	{
		this.ruyuanYajin = ruyuanYajin;
	}
	

}
