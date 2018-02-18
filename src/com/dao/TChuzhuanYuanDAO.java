package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TChuzhuanYuan;

/**
 * Data access object (DAO) for domain model class TChuzhuanYuan.
 * 
 * @see com.model.TChuzhuanYuan
 * @author MyEclipse Persistence Tools
 */
/**
 * 基于common-logging的运行方式：



Java代码 复制代码 收藏代码
1.package org;   
2.import org.apache.commons.logging.Log;   
3.import org.apache.log4j.Logger;   
4.public class Test extends TagSupport{   
5.public static Log log=LogFactory.getLog(Test.class);   
6.public static void test()   
7.{   
8.log.debug("111");   
9.log.info("125");   
10.log.warn("485");   
11.log.error("error");   
12.  
13.}   
14.public static void main(String[] a)   
15.{   
16.Test.test();   
17.}   
18.}   

 */
public class TChuzhuanYuanDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TChuzhuanYuanDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TChuzhuanYuan transientInstance)
	{
		log.debug("saving TChuzhuanYuan instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TChuzhuanYuan persistentInstance)
	{
		log.debug("deleting TChuzhuanYuan instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TChuzhuanYuan findById(java.lang.Integer id)
	{
		log.debug("getting TChuzhuanYuan instance with id: " + id);
		try
		{
			TChuzhuanYuan instance = (TChuzhuanYuan) getHibernateTemplate()
					.get("com.model.TChuzhuanYuan", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TChuzhuanYuan instance)
	{
		log.debug("finding TChuzhuanYuan instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TChuzhuanYuan instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TChuzhuanYuan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAllChuyuan()
	{
		log.debug("finding all TChuzhuanYuan instances");
		try
		{
			String queryString = "from TChuzhuanYuan where chuzhuanYuanOne5=0";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List findAllZhuanyuan()
	{
		log.debug("finding all TChuzhuanYuan instances");
		try
		{
			String queryString = "from TChuzhuanYuan where chuzhuanYuanOne5=1";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TChuzhuanYuan merge(TChuzhuanYuan detachedInstance)
	{
		log.debug("merging TChuzhuanYuan instance");
		try
		{
			TChuzhuanYuan result = (TChuzhuanYuan) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TChuzhuanYuan instance)
	{
		log.debug("attaching dirty TChuzhuanYuan instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TChuzhuanYuan instance)
	{
		log.debug("attaching clean TChuzhuanYuan instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TChuzhuanYuanDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TChuzhuanYuanDAO) ctx.getBean("TChuzhuanYuanDAO");
	}
}