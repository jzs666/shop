package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	@Autowired
//	@Qualifier("DBUserDAO")
	private UserDao userDao;

	@Transactional(readOnly = true)
	public List<UserDTO> getUsers() {
		return userDao.findAll();
	}

	@Transactional
	public void createUser(UserDTO user) {
		userDao.save(user);
	}

}