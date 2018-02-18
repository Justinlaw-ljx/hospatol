package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TGongfei;

/**
 * Data access object (DAO) for domain model class TGongfei.
 * 
 * @see com.model.TGongfei
 * @author MyEclipse Persistence Tools
 */

public class TGongfeiDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TGongfeiDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(TGongfei transientInstance)
	{
		log.debug("saving TGongfei instance");
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

	public void delete(TGongfei persistentInstance)
	{
		log.debug("deleting TGongfei instance");
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

	public TGongfei findById(java.lang.Integer id)
	{
		log.debug("getting TGongfei instance with id: " + id);
		try
		{
			TGongfei instance = (TGongfei) getHibernateTemplate().get(
					"com.model.TGongfei", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TGongfei instance)
	{
		log.debug("finding TGongfei instance by example");
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
		log.debug("finding TGongfei instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TGongfei as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll()
	{
		log.debug("finding all TGongfei instances");
		try
		{
			String queryString = "from TGongfei";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TGongfei merge(TGongfei detachedInstance)
	{
		log.debug("merging TGongfei instance");
		try
		{
			TGongfei result = (TGongfei) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TGongfei instance)
	{
		log.debug("attaching dirty TGongfei instance");
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

	public void attachClean(TGongfei instance)
	{
		log.debug("attaching clean TGongfei instance");
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

	public static TGongfeiDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TGongfeiDAO) ctx.getBean("TGongfeiDAO");
	}
}