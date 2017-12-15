package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value="prototype")
public class UserService {

	@Autowired
	private IUserDao userDao;
	@Autowired
	private IProductDAO productDao;

	@Transactional(readOnly = true)
	public List<UserDTO> getUsers() {
		return userDao.findAll();
	}

	@Transactional
	public void createUser(UserDTO user) {
		userDao.save(user);
	}

	@Transactional(readOnly = true)
	public List<ProductDTO> getProducts() {
		return productDao.findAll();
	}

	@Transactional
	public void createProducts(ProductDTO product) {
		productDao.save(product);
	}

}