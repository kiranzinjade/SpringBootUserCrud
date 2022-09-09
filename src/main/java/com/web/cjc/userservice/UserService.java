package com.web.cjc.userservice;

import java.util.List;

import com.web.cjc.model.User;

public interface UserService {

	public User createUser(User user);

	public void deleteUser(Long uid);

	public List<User> getAllUser();

	public User getUserByName(String uname);

//	public User updateUser(Long uid);

	public User updateUser(User user, Long uid);

//	public User saveUser(User user);

}
