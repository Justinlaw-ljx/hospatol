package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGongfeiDAO;
import com.dao.TYaopinDAO;
import com.model.TGongfei;
import com.opensymphony.xwork2.ActionSupport;

public class GongfeiAction extends ActionSupport
{

	private int gongfieId;
	private String gongfeiShiyou;
	private String gongfeiJinE;
	private String gongfeiRiqi;
	private String gongfeiOne1;
	
	private String message;
	private String path;
	private TGongfeiDAO gongfeiDAO;
	
	public String gongFeiManage()
	{
		    List gongfeiList=gongfeiDAO.findAll();
		    Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("gongfeiList", gongfeiList);
			return ActionSupport.SUCCESS;
	}
	
	public String gongfeiEdit()
	{
		    TGongfei gongfei=gongfeiDAO.findById(gongfieId);
		    Map request=(Map)ServletActionContext.getContext().get("request");
			request.put("gongfei", gongfei);
			return ActionSupport.SUCCESS;
	}
	
	
	public String gongfeiAdd()
	{
		 TGongfei gongfei=new TGongfei();
		 gongfei.setGongfeiJinE(gongfeiJinE);
		 gongfei.setGongfeiOne1(gongfeiOne1);
		 gongfei.setGongfeiRiqi(gongfeiRiqi);
		 gongfei.setGongfeiShiyou(gongfeiShiyou);
		
		 gongfeiDAO.save(gongfei);
		    this.setMessage("添加入库");
			this.setPath("gongFeiManage.action");
			return "succeed";
	}
	
	
	public String gongfeiEdit1()
	{
		TGongfei gongfei=gongfeiDAO.findById(gongfieId);
		 gongfei.setGongfeiJinE(gongfeiJinE);
		 gongfei.setGongfeiOne1(gongfeiOne1);
		 gongfei.setGongfeiRiqi(gongfeiRiqi);
		 gongfei.setGongfeiShiyou(gongfeiShiyou);
		
		 gongfeiDAO.getHibernateTemplate().update(gongfei);
		    this.setMessage("编辑成功");
			this.setPath("gongFeiManage.action");
			return "succeed";
	}
	
	
	public String gongfeiDel()
	{
		gongfeiDAO.delete(gongfeiDAO.findById(gongfieId));
		this.setMessage("删除成功");
		this.setPath("gongFeiManage.action");
		return "succeed";
	}
	
	
	public TGongfeiDAO getGongfeiDAO()
	{
		return gongfeiDAO;
	}
	public void setGongfeiDAO(TGongfeiDAO gongfeiDAO)
	{
		this.gongfeiDAO = gongfeiDAO;
	}
	public String getGongfeiJinE()
	{
		return gongfeiJinE;
	}
	public void setGongfeiJinE(String gongfeiJinE)
	{
		this.gongfeiJinE = gongfeiJinE;
	}
	public String getGongfeiOne1()
	{
		return gongfeiOne1;
	}
	public void setGongfeiOne1(String gongfeiOne1)
	{
		this.gongfeiOne1 = gongfeiOne1;
	}
	public String getGongfeiRiqi()
	{
		return gongfeiRiqi;
	}
	public void setGongfeiRiqi(String gongfeiRiqi)
	{
		this.gongfeiRiqi = gongfeiRiqi;
	}
	public String getGongfeiShiyou()
	{
		return gongfeiShiyou;
	}
	public void setGongfeiShiyou(String gongfeiShiyou)
	{
		this.gongfeiShiyou = gongfeiShiyou;
	}
	public int getGongfieId()
	{
		return gongfieId;
	}
	public void setGongfieId(int gongfieId)
	{
		this.gongfieId = gongfieId;
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
	
}
