package com.web.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.cjc.model.User;
import com.web.cjc.userservice.UserService;

@RestController
public class UserController {


	@Autowired
 private UserService us;
	
	@PostMapping("/createuser")
	public  ResponseEntity<User> createUser(@RequestBody User user)
	{
		
		return new ResponseEntity<>(us.createUser(user),HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteuser/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable("uid") Long uid)
	{
		us.deleteUser(uid);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	
	
	@GetMapping("/getalluser")
	public ResponseEntity<List<User>> getAllUser()
	{
		
		return new ResponseEntity<>(us.getAllUser(),HttpStatus.OK);
	}
	
	@GetMapping("/getuserbyname/{uname}")
	public ResponseEntity<User> getUserByName(@PathVariable("uname") String uname)
	{
	 return new ResponseEntity<User>(us.getUserByName(uname),HttpStatus.OK);
		
	}
	
	@PutMapping("/updateuser/{uid}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("uid") Long uid)
	{
	return new ResponseEntity<User>(us.updateUser(user,uid),HttpStatus.OK);

	}
	@PatchMapping("/partialupdate/{uid}/{uname}")
	public ResponseEntity<User>updateAdharNo(@PathVariable("uid") Long uid,@PathVariable("uname") String uname)
	{
		User ur=us.partialUpdateData(uid,uname);
		return new ResponseEntity<User>(ur,HttpStatus.OK);
	}
	
}
