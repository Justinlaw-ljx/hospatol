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
			yuangong.setYuangongSex("��");
		}
		if(yuangongSex.endsWith("nv"))
		{
			yuangong.setYuangongSex("Ů");
		}
		
		if(yuangongZhiwei.endsWith("jizhenyisheng"))
		{
			yuangong.setYuangongZhiwei("����ҽ��");
		}
		if(yuangongZhiwei.endsWith("menzhenyisheng"))
		{
			yuangong.setYuangongZhiwei("����ҽ��");
		}
		if(yuangongZhiwei.endsWith("zhuyuanbuyisheng"))
		{
			yuangong.setYuangongZhiwei("סԺ��ҽ��");
		}
		if(yuangongZhiwei.endsWith("jizhenhushi"))
		{
			yuangong.setYuangongZhiwei("���ﻤʿ");
		}
		if(yuangongZhiwei.endsWith("menzhenhushi"))
		{
			yuangong.setYuangongZhiwei("���ﻤʿ");
		}
		if(yuangongZhiwei.endsWith("zhuyuanbuhushi"))
		{
			yuangong.setYuangongZhiwei("סԺ����ʿ");
		}
		if(yuangongZhiwei.endsWith("danjia"))
		{
			yuangong.setYuangongZhiwei("���ܹ�");
		}
		if(yuangongZhiwei.endsWith("jiexiansheng"))
		{
			yuangong.setYuangongZhiwei("������");
		}
		yuangong.setYuangongTel(yuangongTel);
		
		yuangongDAO.save(yuangong);
		this.setMessage("¼��ɹ�");
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
			yuangong.setYuangongSex("��");
		}
		if(yuangongSex.endsWith("nv"))
		{
			yuangong.setYuangongSex("Ů");
		}
		
		if(yuangongZhiwei.endsWith("yisheng"))
		{
			yuangong.setYuangongZhiwei("ҽ��");
		}
		if(yuangongZhiwei.endsWith("hushi"))
		{
			yuangong.setYuangongZhiwei("��ʿ");
		}
		if(yuangongZhiwei.endsWith("danjia"))
		{
			yuangong.setYuangongZhiwei("���ܹ�");
		}
		yuangong.setYuangongTel(yuangongTel);
		
		yuangongDAO.getHibernateTemplate().update(yuangong);
		this.setMessage("�༭�ɹ�");
		this.setPath("yuangongManage.action");
		return "succeed";
	}
	
	
	public String yuangongDel()
	{
		yuangongDAO.delete(yuangongDAO.findById(yuangongId));
		this.setMessage("ɾ���ɹ�");
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
