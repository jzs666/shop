package it.akademija.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import it.akademija.DTO.*;
import it.akademija.Respository.*;


@Transactional
@Service
public class CartService {

	@Autowired
	private ICartRepository cartRepo;
	
//	@Autowired
//	private IProductRepository productRepo;
	
	

	public List<CartDTO> getAll() {
		return cartRepo.findAll();
	}
//
//	public List<ProductDTO> getProducts(long cart_id) {
//		return productRepo.findAll();
//	}

	public CartDTO addCart(CartDTO cart) {
		return cartRepo.save(cart);
	}

	public CartDTO findOne(long id) {
		return cartRepo.findOne(id);
	}

	public void delete(CartDTO cart) {
		cartRepo.delete(cart);
		
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
