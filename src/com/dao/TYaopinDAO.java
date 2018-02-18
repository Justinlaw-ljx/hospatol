package com.dao;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TYaopin;

/**
 * Data access object (DAO) for domain model class TYaopin.
 * 
 * @see com.model.TYaopin
 * @author MyEclipse Persistence Tools
 */

public class TYaopinDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TYaopinDAO.class);

	// property constants
	public static final String YAOPIN_NAME = "yaopinName";

	public static final String YAOPIN_DANWEI = "yaopinDanwei";

	public static final String YAOPIN_JIEGE = "yaopinJiege";

	public static final String YAOPIN_SHULIANG = "yaopinShuliang";

	public static final String YAOPIN_USER = "yaopinUser";

	public static final String YAOPIN_RUKUDATE = "yaopinRukudate";

	public static final String YAOPIN_ONE1 = "yaopinOne1";

	public static final String YAOPIN_ONE2 = "yaopinOne2";

	public static final String YAOPIN_ONE3 = "yaopinOne3";

	public static final String YAOPIN_ONE4 = "yaopinOne4";

	public static final String YAOPIN_ONE5 = "yaopinOne5";

	public static final String YAOPIN_ONE6 = "yaopinOne6";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TYaopin transientInstance)
	{
		log.debug("saving TYaopin instance");
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

	public void delete(TYaopin persistentInstance)
	{
		log.debug("deleting TYaopin instance");
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

	public TYaopin findById(java.lang.Integer id)
	{
		log.debug("getting TYaopin instance with id: " + id);
		try
		{
			TYaopin instance = (TYaopin) getHibernateTemplate().get(
					"com.model.TYaopin", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TYaopin instance)
	{
		log.debug("finding TYaopin instance by example");
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
		log.debug("finding TYaopin instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TYaopin as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYaopinName(Object yaopinName)
	{
		return findByProperty(YAOPIN_NAME, yaopinName);
	}

	public List findByYaopinDanwei(Object yaopinDanwei)
	{
		return findByProperty(YAOPIN_DANWEI, yaopinDanwei);
	}

	public List findByYaopinJiege(Object yaopinJiege)
	{
		return findByProperty(YAOPIN_JIEGE, yaopinJiege);
	}

	public List findByYaopinShuliang(Object yaopinShuliang)
	{
		return findByProperty(YAOPIN_SHULIANG, yaopinShuliang);
	}

	public List findByYaopinUser(Object yaopinUser)
	{
		return findByProperty(YAOPIN_USER, yaopinUser);
	}

	public List findByYaopinRukudate(Object yaopinRukudate)
	{
		return findByProperty(YAOPIN_RUKUDATE, yaopinRukudate);
	}

	public List findByYaopinOne1(Object yaopinOne1)
	{
		return findByProperty(YAOPIN_ONE1, yaopinOne1);
	}

	public List findByYaopinOne2(Object yaopinOne2)
	{
		return findByProperty(YAOPIN_ONE2, yaopinOne2);
	}

	public List findByYaopinOne3(Object yaopinOne3)
	{
		return findByProperty(YAOPIN_ONE3, yaopinOne3);
	}

	public List findByYaopinOne4(Object yaopinOne4)
	{
		return findByProperty(YAOPIN_ONE4, yaopinOne4);
	}

	public List findByYaopinOne5(Object yaopinOne5)
	{
		return findByProperty(YAOPIN_ONE5, yaopinOne5);
	}

	public List findByYaopinOne6(Object yaopinOne6)
	{
		return findByProperty(YAOPIN_ONE6, yaopinOne6);
	}

	public List findAll()
	{
		log.debug("finding all TYaopin instances");
		try
		{
			String queryString = "from TYaopin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TYaopin merge(TYaopin detachedInstance)
	{
		log.debug("merging TYaopin instance");
		try
		{
			TYaopin result = (TYaopin) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TYaopin instance)
	{
		log.debug("attaching dirty TYaopin instance");
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

	public void attachClean(TYaopin instance)
	{
		log.debug("attaching clean TYaopin instance");
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

	public static TYaopinDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TYaopinDAO) ctx.getBean("TYaopinDAO");
	}
}