package com.dao;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TFeiyong;

/**
 * Data access object (DAO) for domain model class TFeiyong.
 * 
 * @see com.model.TFeiyong
 * @author MyEclipse Persistence Tools
 */

public class TFeiyongDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TFeiyongDAO.class);

	// property constants
	public static final String FEIYONG_DATE = "feiyongDate";

	public static final String FEIYONG_NAME = "feiyongName";

	public static final String FEIYONG_MONEY = "feiyongMoney";

	public static final String FEIYONG_BINGREN_ID = "feiyongBingrenId";

	public static final String FEIYONG_BINGREN_NAME = "feiyongBingrenName";

	public static final String ONE1 = "one1";

	public static final String ONE2 = "one2";

	public static final String ONE3 = "one3";

	public static final String ONE4 = "one4";

	public static final String ONE5 = "one5";

	public static final String ONE6 = "one6";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TFeiyong transientInstance)
	{
		log.debug("saving TFeiyong instance");
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

	public void delete(TFeiyong persistentInstance)
	{
		log.debug("deleting TFeiyong instance");
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

	public TFeiyong findById(java.lang.Integer id)
	{
		log.debug("getting TFeiyong instance with id: " + id);
		try
		{
			TFeiyong instance = (TFeiyong) getHibernateTemplate().get(
					"com.model.TFeiyong", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TFeiyong instance)
	{
		log.debug("finding TFeiyong instance by example");
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
		log.debug("finding TFeiyong instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TFeiyong as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFeiyongDate(Object feiyongDate)
	{
		return findByProperty(FEIYONG_DATE, feiyongDate);
	}

	public List findByFeiyongName(Object feiyongName)
	{
		return findByProperty(FEIYONG_NAME, feiyongName);
	}

	public List findByFeiyongMoney(Object feiyongMoney)
	{
		return findByProperty(FEIYONG_MONEY, feiyongMoney);
	}

	public List findByFeiyongBingrenId(Object feiyongBingrenId)
	{
		return findByProperty(FEIYONG_BINGREN_ID, feiyongBingrenId);
	}

	public List findByFeiyongBingrenName(Object feiyongBingrenName)
	{
		return findByProperty(FEIYONG_BINGREN_NAME, feiyongBingrenName);
	}

	public List findByOne1(Object one1)
	{
		return findByProperty(ONE1, one1);
	}

	public List findByOne2(Object one2)
	{
		return findByProperty(ONE2, one2);
	}

	public List findByOne3(Object one3)
	{
		return findByProperty(ONE3, one3);
	}

	public List findByOne4(Object one4)
	{
		return findByProperty(ONE4, one4);
	}

	public List findByOne5(Object one5)
	{
		return findByProperty(ONE5, one5);
	}

	public List findByOne6(Object one6)
	{
		return findByProperty(ONE6, one6);
	}

	public List findAll()
	{
		log.debug("finding all TFeiyong instances");
		try
		{
			String queryString = "from TFeiyong";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TFeiyong merge(TFeiyong detachedInstance)
	{
		log.debug("merging TFeiyong instance");
		try
		{
			TFeiyong result = (TFeiyong) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TFeiyong instance)
	{
		log.debug("attaching dirty TFeiyong instance");
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

	public void attachClean(TFeiyong instance)
	{
		log.debug("attaching clean TFeiyong instance");
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

	public static TFeiyongDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TFeiyongDAO) ctx.getBean("TFeiyongDAO");
	}
}