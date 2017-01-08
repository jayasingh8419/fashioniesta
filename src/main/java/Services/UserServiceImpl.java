package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Models.Users;
import dao.UserDao;
import daoimpl.UserDaoImpl;

public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDaoImpl userDao;
	
	
	
	/*public UserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/
	
	public void addUsers(Users user) {
		// TODO Auto-generated method stub
		userDao.addUsers(user);
	}



	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		List<Users> userList=userDao.getAllUsers();
		return userList;
	}



	/*public Users getUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(userName);*/
	}

	
	


