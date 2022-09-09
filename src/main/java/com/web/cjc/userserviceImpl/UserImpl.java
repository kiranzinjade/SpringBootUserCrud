package com.web.cjc.userserviceImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.cjc.model.User;
import com.web.cjc.userrepository.UserRepository;
import com.web.cjc.userservice.UserService;

@Service
public class UserImpl implements UserService {

	@Autowired
	UserRepository ur;
	
	@Override
	public User createUser(User user) {
		
		return ur.save(user);
	}

	@Override
	public void deleteUser(Long uid) {
		ur.deleteById(uid);
		
	}

	@Override
	public List<User> getAllUser() {
		
		return ur.findAll();
	}

	@Override
	public User getUserByName(String uname) {
		
		return ur.findByUname(uname);
	}

	@Override
	public User updateUser(User user, Long uid) {
		User u=ur.findByUid(uid);
		
//		u.setUid(user.getUid());
		u.setUname(user.getUname());
		u.setUserAdhar(user.getUserAdhar());
		
		
		return ur.save(u);
	}


	
//	@Override
//	public User updateUser(Long uid) {
//		
//		return ur.findByUid(uid);
//	}

//	@Override
//	public User saveUser(User user) {
//		
//		return ur.save(user);
//	}
//	

	}

