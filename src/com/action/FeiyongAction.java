package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TFeiyongDAO;
import com.dao.TRuyuanDAO;
import com.model.TFeiyong;
import com.opensymphony.xwork2.ActionSupport;

public class FeiyongAction extends ActionSupport
{
	private TRuyuanDAO ruyuanDAO;
	private TFeiyongDAO feiyongDAO;
	
	private int feiyongId;
	private String feiyongDate;
	private String feiyongName;
	private int feiyongMoney;
	private int feiyongBingrenId;// 是id
	private String feiyongBingrenName;
	
	
	private String message;
	private String path;
	
	public String feiyongAdd()
	{
		List ruyuanList=ruyuanDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("ruyuanList", ruyuanList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String feiyongDel()
	{
		feiyongDAO.delete(feiyongDAO.findById(feiyongId));
		this.setMessage("删除成功");
		this.setPath("feiyongManage.action");
		return "succeed";
	}
    
	
	public String feiyongEdit()
	{
		TFeiyong feiyong=(TFeiyong)feiyongDAO.findById(feiyongId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("feiyong", feiyong);
		return ActionSupport.SUCCESS;
	}
	
	
	public String feiyongEdit1()
	{
		TFeiyong feiyong=(TFeiyong)feiyongDAO.findById(feiyongId);
		feiyong.setFeiyongDate(feiyongDate);
		feiyong.setFeiyongName(feiyongName);
		feiyong.setFeiyongMoney(feiyongMoney);
		feiyong.setFeiyongBingrenId(feiyongBingrenId);
		feiyong.setFeiyongBingrenName(feiyongBingrenName);
		feiyongDAO.getHibernateTemplate().update(feiyong);
		this.setMessage("修改成功");
		this.setPath("feiyongManage.action");
		return "succeed";
	}
	
	
	
	public String feiyongAdd1()
	{
		TFeiyong feiyong=new TFeiyong();
		feiyong.setFeiyongDate(feiyongDate);
		feiyong.setFeiyongName(feiyongName);
		feiyong.setFeiyongMoney(feiyongMoney);
		feiyong.setFeiyongBingrenId(feiyongBingrenId);
		feiyong.setFeiyongBingrenName(feiyongBingrenName);
		feiyongDAO.save(feiyong);
		this.setMessage("记账成功");
		this.setPath("feiyongManage.action");
		return "succeed";
	}
	
	public String jiezhang()
	{
		List ruyuanList=ruyuanDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("ruyuanList", ruyuanList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String jiezhang1()
	{
		String sql="from TFeiyong where feiyongBingrenId=?";
		Object[] con={feiyongBingrenId};
		List feiyongList=feiyongDAO.getHibernateTemplate().find(sql,con);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("feiyongList", feiyongList);
		
		sql="select sum(feiyongMoney) from TFeiyong where feiyongBingrenId=?";
		Object[] con1={feiyongBingrenId};
		feiyongList=feiyongDAO.getHibernateTemplate().find(sql,con1);
		request.put("feiyongAll", feiyongList.get(0).toString());
		
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	public String feiyongManage()
	{
		List feiyongList=feiyongDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("feiyongList", feiyongList);
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
	public TRuyuanDAO getRuyuanDAO()
	{
		return ruyuanDAO;
	}

	public String getFeiyongBingrenName()
	{
		return feiyongBingrenName;
	}

	public void setFeiyongBingrenName(String feiyongBingrenName)
	{
		this.feiyongBingrenName = feiyongBingrenName;
	}

	public void setRuyuanDAO(TRuyuanDAO ruyuanDAO)
	{
		this.ruyuanDAO = ruyuanDAO;
	}



	public TFeiyongDAO getFeiyongDAO()
	{
		return feiyongDAO;
	}



	public void setFeiyongDAO(TFeiyongDAO feiyongDAO)
	{
		this.feiyongDAO = feiyongDAO;
	}



	public int getFeiyongBingrenId()
	{
		return feiyongBingrenId;
	}


	public void setFeiyongBingrenId(int feiyongBingrenId)
	{
		this.feiyongBingrenId = feiyongBingrenId;
	}


	public String getFeiyongDate()
	{
		return feiyongDate;
	}


	public void setFeiyongDate(String feiyongDate)
	{
		this.feiyongDate = feiyongDate;
	}


	public int getFeiyongMoney()
	{
		return feiyongMoney;
	}


	public void setFeiyongMoney(int feiyongMoney)
	{
		this.feiyongMoney = feiyongMoney;
	}


	public String getFeiyongName()
	{
		return feiyongName;
	}


	public void setFeiyongName(String feiyongName)
	{
		this.feiyongName = feiyongName;
	}


	public int getFeiyongId()
	{
		return feiyongId;
	}


	public void setFeiyongId(int feiyongId)
	{
		this.feiyongId = feiyongId;
	}
	
}
