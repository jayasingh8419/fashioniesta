package dao;

import java.util.List;

import Models.Users;

public interface UserDao {
	
	void addUsers(Users user);
	public List<Users> getAllUsers();
	
	
	
	Users getUserByUsername(String userName);

	}





