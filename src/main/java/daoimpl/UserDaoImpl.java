package daoimpl;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Models.Authorities;
import Models.Users;

@Repository
public class UserDaoImpl implements Serializable{
	
	@Autowired
	private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

		
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void addUsers(Users user) {
		Session session=sessionFactory.openSession();
		Authorities a=new Authorities();
		a.setUsername(user.getUsername());
		a.setAuthorities("ROLE_USER");
		a.setAuthoritiesId(user.getUserId());
		user.setEnabled(true);
		session.save(user);
		session.save(a);
		session.flush();
                        session.close();
	}
	
	public List<Users> getAllUsers() {
		Session session=sessionFactory.openSession();
		List<Users> users=session.createQuery("from Users").list();
		return users;
	}

}
