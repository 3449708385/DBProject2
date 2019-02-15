package com.mgp.dbproject.usermanager.service;

import com.mgp.dbproject.usermanager.beans.User;

public interface UserService {

	
	public void removeUser();

	public User findUserByUsername(String username);
}
