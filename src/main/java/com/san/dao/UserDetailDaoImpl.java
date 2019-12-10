package com.san.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.san.model.User;

@Repository
@Transactional
public class UserDetailDaoImpl implements UserDetailDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public User findByEmail(String email) {
		email="san@gmail.com";
		return (User) sessionFactory.openSession().createQuery("from User where email='" + email + "'").uniqueResult();
	}

}
