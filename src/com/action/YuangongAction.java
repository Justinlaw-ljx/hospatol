package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.dao.TYuangongDAO;
import com.model.TYuangong;
import com.opensymphony.xwork2.ActionSupport;

public class YuangongAction extends ActionSupport
{

	private int yuangongId;
	private String yuangongName;
	private String yuangongSex;
	private String yuangongAge;
	private String yuangongTel;
	private String yuangongZhiwei;
	
	private String message;
	private String path;
	
	private TYuangongDAO yuangongDAO;

	
	public String yuangongManage()
	{
		List yuangongList=yuangongDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yuangongList", yuangongList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String yuangongSearch()
	{
		String sql="from TYuangong t where t.yuangongName like '%"+yuangongName+"%'";
		List yuangongList=yuangongDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yuangongList", yuangongList);
		return ActionSupport.SUCCESS;
	}
	
	public String yuangongEdit()
	{
		TYuangong yuangong=yuangongDAO.findById(yuangongId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yuangong", yuangong);
		return ActionSupport.SUCCESS;
	}
	
	
	public String yuangongAdd()
	{
		TYuangong yuangong=new TYuangong();
		yuangong.setYuangongAge(yuangongAge);
		yuangong.setYuangongName(yuangongName);
		if(yuangongSex.endsWith("nan"))
		{
			yuangong.setYuangongSex("男");
		}
		if(yuangongSex.endsWith("nv"))
		{
			yuangong.setYuangongSex("女");
		}
		
		if(yuangongZhiwei.endsWith("jizhenyisheng"))
		{
			yuangong.setYuangongZhiwei("急诊医生");
		}
		if(yuangongZhiwei.endsWith("menzhenyisheng"))
		{
			yuangong.setYuangongZhiwei("门诊医生");
		}
		if(yuangongZhiwei.endsWith("zhuyuanbuyisheng"))
		{
			yuangong.setYuangongZhiwei("住院部医生");
		}
		if(yuangongZhiwei.endsWith("jizhenhushi"))
		{
			yuangong.setYuangongZhiwei("急诊护士");
		}
		if(yuangongZhiwei.endsWith("menzhenhushi"))
		{
			yuangong.setYuangongZhiwei("门诊护士");
		}
		if(yuangongZhiwei.endsWith("zhuyuanbuhushi"))
		{
			yuangong.setYuangongZhiwei("住院部护士");
		}
		if(yuangongZhiwei.endsWith("danjia"))
		{
			yuangong.setYuangongZhiwei("担架工");
		}
		if(yuangongZhiwei.endsWith("jiexiansheng"))
		{
			yuangong.setYuangongZhiwei("接线生");
		}
		yuangong.setYuangongTel(yuangongTel);
		
		yuangongDAO.save(yuangong);
		this.setMessage("录入成功");
		this.setPath("yuangongManage.action");
		return "succeed";
	}
	
	
	public String yuangongEdit1()
	{
		TYuangong yuangong=yuangongDAO.findById(yuangongId);
		yuangong.setYuangongAge(yuangongAge);
		yuangong.setYuangongName(yuangongName);
		if(yuangongSex.endsWith("nan"))
		{
			yuangong.setYuangongSex("男");
		}
		if(yuangongSex.endsWith("nv"))
		{
			yuangong.setYuangongSex("女");
		}
		
		if(yuangongZhiwei.endsWith("yisheng"))
		{
			yuangong.setYuangongZhiwei("医生");
		}
		if(yuangongZhiwei.endsWith("hushi"))
		{
			yuangong.setYuangongZhiwei("护士");
		}
		if(yuangongZhiwei.endsWith("danjia"))
		{
			yuangong.setYuangongZhiwei("担架工");
		}
		yuangong.setYuangongTel(yuangongTel);
		
		yuangongDAO.getHibernateTemplate().update(yuangong);
		this.setMessage("编辑成功");
		this.setPath("yuangongManage.action");
		return "succeed";
	}
	
	
	public String yuangongDel()
	{
		yuangongDAO.delete(yuangongDAO.findById(yuangongId));
		this.setMessage("删除成功");
		this.setPath("yuangongManage.action");
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

	public String getYuangongAge()
	{
		return yuangongAge;
	}

	public void setYuangongAge(String yuangongAge)
	{
		this.yuangongAge = yuangongAge;
	}

	public TYuangongDAO getYuangongDAO()
	{
		return yuangongDAO;
	}

	public void setYuangongDAO(TYuangongDAO yuangongDAO)
	{
		this.yuangongDAO = yuangongDAO;
	}

	public int getYuangongId()
	{
		return yuangongId;
	}

	public void setYuangongId(int yuangongId)
	{
		this.yuangongId = yuangongId;
	}

	public String getYuangongName()
	{
		return yuangongName;
	}

	public void setYuangongName(String yuangongName)
	{
		this.yuangongName = yuangongName;
	}

	public String getYuangongSex()
	{
		return yuangongSex;
	}

	public void setYuangongSex(String yuangongSex)
	{
		this.yuangongSex = yuangongSex;
	}

	public String getYuangongTel()
	{
		return yuangongTel;
	}

	public void setYuangongTel(String yuangongTel)
	{
		this.yuangongTel = yuangongTel;
	}

	public String getYuangongZhiwei()
	{
		return yuangongZhiwei;
	}

	public void setYuangongZhiwei(String yuangongZhiwei)
	{
		this.yuangongZhiwei = yuangongZhiwei;
	}
	
}
