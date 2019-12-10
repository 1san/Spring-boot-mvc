package com.san.dao;

import com.san.model.User;

public interface UserDetailDao {

	public User findByEmail(String email);
}
