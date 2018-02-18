package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TRuyuan;

/**
 * Data access object (DAO) for domain model class TRuyuan.
 * 
 * @see com.model.TRuyuan
 * @author MyEclipse Persistence Tools
 */

public class TRuyuanDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TRuyuanDAO.class);

	// property constants
	public static final String RUYUAN_BINGHAO_NAME = "ruyuanBinghaoName";

	public static final String RUYUAN_BINGHAO_AGE = "ruyuanBinghaoAge";

	public static final String RUYUAN_BINGHAO_TEL = "ruyuanBinghaoTel";

	public static final String RUYUAN_BINGHAO_SEX = "ruyuanBinghaoSex";

	public static final String RUYUAN_YAJIN = "ruyuanYajin";

	public static final String RUYUAN_DATE = "ruyuanDate";

	public static final String ONE1 = "one1";

	public static final String ONE2 = "one2";

	public static final String ONE3 = "one3";

	public static final String ONE4 = "one4";

	public static final String ONE5 = "one5";

	public static final String ONE6 = "one6";

	public static final String ONE7 = "one7";

	public static final String ONE8 = "one8";

	public static final String ONE9 = "one9";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TRuyuan transientInstance)
	{
		log.debug("saving TRuyuan instance");
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

	public void delete(TRuyuan persistentInstance)
	{
		log.debug("deleting TRuyuan instance");
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

	public TRuyuan findById(java.lang.Integer id)
	{
		log.debug("getting TRuyuan instance with id: " + id);
		try
		{
			TRuyuan instance = (TRuyuan) getHibernateTemplate().get(
					"com.model.TRuyuan", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TRuyuan instance)
	{
		log.debug("finding TRuyuan instance by example");
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
		log.debug("finding TRuyuan instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TRuyuan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRuyuanBinghaoName(Object ruyuanBinghaoName)
	{
		return findByProperty(RUYUAN_BINGHAO_NAME, ruyuanBinghaoName);
	}

	public List findByRuyuanBinghaoAge(Object ruyuanBinghaoAge)
	{
		return findByProperty(RUYUAN_BINGHAO_AGE, ruyuanBinghaoAge);
	}

	public List findByRuyuanBinghaoTel(Object ruyuanBinghaoTel)
	{
		return findByProperty(RUYUAN_BINGHAO_TEL, ruyuanBinghaoTel);
	}

	public List findByRuyuanBinghaoSex(Object ruyuanBinghaoSex)
	{
		return findByProperty(RUYUAN_BINGHAO_SEX, ruyuanBinghaoSex);
	}

	public List findByRuyuanYajin(Object ruyuanYajin)
	{
		return findByProperty(RUYUAN_YAJIN, ruyuanYajin);
	}

	public List findByRuyuanDate(Object ruyuanDate)
	{
		return findByProperty(RUYUAN_DATE, ruyuanDate);
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

	public List findByOne7(Object one7)
	{
		return findByProperty(ONE7, one7);
	}

	public List findByOne8(Object one8)
	{
		return findByProperty(ONE8, one8);
	}

	public List findByOne9(Object one9)
	{
		return findByProperty(ONE9, one9);
	}

	public List findAll()
	{
		log.debug("finding all TRuyuan instances");
		try
		{
			String queryString = "from TRuyuan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TRuyuan merge(TRuyuan detachedInstance)
	{
		log.debug("merging TRuyuan instance");
		try
		{
			TRuyuan result = (TRuyuan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TRuyuan instance)
	{
		log.debug("attaching dirty TRuyuan instance");
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

	public void attachClean(TRuyuan instance)
	{
		log.debug("attaching clean TRuyuan instance");
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

	public static TRuyuanDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TRuyuanDAO) ctx.getBean("TRuyuanDAO");
	}
}