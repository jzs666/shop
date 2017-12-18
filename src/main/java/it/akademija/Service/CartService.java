package it.akademija.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import it.akademija.DTO.*;
import it.akademija.Entity.CartEntity;
import it.akademija.Entity.ProductEntity;
import it.akademija.Respository.*;


@Transactional
@Service
public class CartService {

	@Autowired
	private ICartRepository cartRepo;
	
	@Autowired
	private IProductRepository productRepo;
	
	@Autowired
	private IUserDao customer;
	
	public List<ProductEntity> getProducts(long cart_id) {
		return cartRepo.findOne(cart_id).getProducts();
	}

	public CartEntity addToCart(long product_id, long quantity, String name) {
//		UserDTO cust = customer.findByusername(name);
//		List<CartDTO> carts = cartRepo.findAllByProductId(product_id);
//		System.out.println();
//		carts.stream().filter((p)=>p)
//		return cartRepo.save(cart);
		return new CartEntity();
	}

	public CartEntity findOne(long id) {
		return cartRepo.findOne(id);
	}

	public void delete(CartEntity cart) {
		cartRepo.delete(cart);
		
	}

	public void findAll() {
		System.out.println(cartRepo.findAll());
//		return new ArryList<CartDTO>();
	}

//	public void addToCart(Long cart_id, Long product_id) {
//		 CartDTO cart = cartRepo.findOne(cart_id);
//	        ProductDTO product = productRepo.findOne(product_id);
//	        if(cart == null || product == null){
//	            throw new NullPointerException();
//	        }
//	        cart.getProducts().add(product);		
//	}
	
	


}
