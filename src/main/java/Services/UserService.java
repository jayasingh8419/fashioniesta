package Services;

import java.util.List;

import Models.Users;

public interface UserService {
		
		public void addUsers(Users user);
		public List<Users> getAllUsers();
		/*Users getUserByUsername(String userName);*/

	}


