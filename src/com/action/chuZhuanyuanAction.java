package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TChuzhuanYuanDAO;
import com.model.TChuzhuanYuan;
import com.opensymphony.xwork2.ActionSupport;

public class chuZhuanyuanAction extends ActionSupport
{
	private int chuzhuanYuanId;
	private String chuzhuanYuanRiqi;
	private String chuzhuanYuanUsername;
	private String chuzhuanYuanBiezhu;
	
	private String message;
	private String path;
	
	private TChuzhuanYuanDAO chuzhuanYuanDAO;
	
	
	
	
	public String chuyuanAdd()
	{
		TChuzhuanYuan chuzhuanYuan=new TChuzhuanYuan();
		chuzhuanYuan.setChuzhuanYuanBiezhu(chuzhuanYuanBiezhu);
		chuzhuanYuan.setChuzhuanYuanRiqi(chuzhuanYuanRiqi);
		chuzhuanYuan.setChuzhuanYuanUsername(chuzhuanYuanUsername);
		chuzhuanYuan.setChuzhuanYuanOne5(0);//0表示出院，1表示转院
		chuzhuanYuanDAO.save(chuzhuanYuan);
		this.setMessage("添加成功");
		this.setPath("chuyuanManage.action");
		return "succeed";
	}

	public String chuyuanManage()
	{
		List chuyuanList=chuzhuanYuanDAO.findAllChuyuan();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("chuyuanList", chuyuanList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String chuyuanDel()
	{
		chuzhuanYuanDAO.delete(chuzhuanYuanDAO.findById(chuzhuanYuanId));
		this.setMessage("删除成功");
		this.setPath("chuyuanManage.action");
		return "succeed";
	}
	
	
	
	public String zhuanyuanAdd()
	{
		TChuzhuanYuan chuzhuanYuan=new TChuzhuanYuan();
		chuzhuanYuan.setChuzhuanYuanBiezhu(chuzhuanYuanBiezhu);
		chuzhuanYuan.setChuzhuanYuanRiqi(chuzhuanYuanRiqi);
		chuzhuanYuan.setChuzhuanYuanUsername(chuzhuanYuanUsername);
		chuzhuanYuan.setChuzhuanYuanOne5(1);//0表示出院，1表示转院
		chuzhuanYuanDAO.save(chuzhuanYuan);
		this.setMessage("添加成功");
		this.setPath("zhuanyuanManage.action");
		return "succeed";
	}

	public String zhuanyuanManage()
	{
		List chuyuanList=chuzhuanYuanDAO.findAllZhuanyuan();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("chuyuanList", chuyuanList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String zhuanyuanDel()
	{
		chuzhuanYuanDAO.delete(chuzhuanYuanDAO.findById(chuzhuanYuanId));
		this.setMessage("删除成功");
		this.setPath("zhuanyuanManage.action");
		return "succeed";
	}
	
	
	
	
	public String getChuzhuanYuanBiezhu()
	{
		return chuzhuanYuanBiezhu;
	}

	public void setChuzhuanYuanBiezhu(String chuzhuanYuanBiezhu)
	{
		this.chuzhuanYuanBiezhu = chuzhuanYuanBiezhu;
	}

	public TChuzhuanYuanDAO getChuzhuanYuanDAO()
	{
		return chuzhuanYuanDAO;
	}

	public void setChuzhuanYuanDAO(TChuzhuanYuanDAO chuzhuanYuanDAO)
	{
		this.chuzhuanYuanDAO = chuzhuanYuanDAO;
	}

	public int getChuzhuanYuanId()
	{
		return chuzhuanYuanId;
	}

	public void setChuzhuanYuanId(int chuzhuanYuanId)
	{
		this.chuzhuanYuanId = chuzhuanYuanId;
	}

	public String getChuzhuanYuanRiqi()
	{
		return chuzhuanYuanRiqi;
	}

	public void setChuzhuanYuanRiqi(String chuzhuanYuanRiqi)
	{
		this.chuzhuanYuanRiqi = chuzhuanYuanRiqi;
	}

	public String getChuzhuanYuanUsername()
	{
		return chuzhuanYuanUsername;
	}

	public void setChuzhuanYuanUsername(String chuzhuanYuanUsername)
	{
		this.chuzhuanYuanUsername = chuzhuanYuanUsername;
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
