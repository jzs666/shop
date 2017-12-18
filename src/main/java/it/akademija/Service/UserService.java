package it.akademija.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.akademija.DTO.*;
import it.akademija.Entity.CartEntity;
import it.akademija.Entity.UserEntity;
import it.akademija.Respository.*;


@Service
@Transactional
public class UserService {

	@Autowired
	private IUserDao userDao;
	
	@PostConstruct
	void PostConstruc() {
		userDao.save(new UserEntity("Juozas", new CartEntity()));
		userDao.save(new UserEntity("Rimas", new CartEntity()));
	}

	@Transactional(readOnly = true)
	public List<UserDTO> getOs() {
		return userDao.findAll()
				.stream()
				.map((e)->{
					UserDTO os = new UserDTO();
					os.setUsername(e.getUsername());
					os.setId(e.getId());
					os.setCart_id(e.getCart().getId());
					return os;}).collect(Collectors.toList());
	}
	

	@Transactional
	public void createUser(UserEntity user) {
		userDao.save(user);
	}


}