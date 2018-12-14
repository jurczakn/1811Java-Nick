package com.revature.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.revature.domains.HoneyPot;

@Component
@Transactional
public class HoneyPotImpl implements HoneyPotDao {

	@Autowired
	private SessionFactory mySessionFactory;
	
	public void saveHoneyPot(HoneyPot hp) {
		mySessionFactory.getCurrentSession().save(hp);
	}

	
	public List<HoneyPot> getAllHoneyPots() {
		//return mySessionFactory.getCurrentSession().createCriteria(HoneyPot.class).list();
		CriteriaQuery query = mySessionFactory.getCurrentSession().getCriteriaBuilder().createQuery(HoneyPot.class);
		query.select(query.from(HoneyPot.class));
		Query<HoneyPot> honeyPotQuery = mySessionFactory.getCurrentSession().createQuery(query);
		return honeyPotQuery.getResultList();
	}

	public HoneyPot getHoneyPotById(Integer id) {
		return mySessionFactory.getCurrentSession().get(HoneyPot.class, id);
	}

}
