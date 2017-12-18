package it.akademija.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.akademija.DTO.*;
import it.akademija.Respository.*;


@Service
@Transactional
//@Scope(value="prototype")
public class UserService {

	@Autowired
	private IUserDao userDao;
	@Autowired
	private ICartRepository cartDao;
	@Autowired
	private IProductRepository productDao;

	@Transactional(readOnly = true)
	public List<UserDTO> getUsers() {
		for(UserDTO user : userDao.findAll())
		{
			System.out.println(user);
		}
		return  userDao.findAll();
	}
	@PostConstruct
	public void pupulate()
	{
		System.out.println("called populate");
		UserDTO user1 = new UserDTO("Juozas", "Juozaitis");
		CartDTO cart = new CartDTO();
		user1.setCart(cart);
		cartDao.save(cart);
	//	suerDAo.save(cart)
//		user1 = new UserDTO("Petras", "Petraitis");
//		user1.setCart(new CartDTO());
//		userDao.save(user1);
//		user1 = new UserDTO("Zigmas", "Zigmaitis");
//		user1.setCart(new CartDTO());
//		userDao.save(user1);
//		
	}

	@Transactional
	public void createUser(UserDTO user) {
		user.setCart(new CartDTO());
		userDao.save(user);
	}

	public void deleteUser(Long userId) {
		userDao.delete(userId);
	}

//	@Transactional(readOnly = true)
//	public List<ProductDTO> getProducts() {
//		return productDao.findAll();
//	}
//
//	@Transactional
//	public void createProducts(ProductDTO product) {
//		productDao.save(product);
//	}

}