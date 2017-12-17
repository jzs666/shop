package it.akademija.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.akademija.DTO.CartDTO;
import it.akademija.Respository.ICartRepository;

@Transactional
@Service
public class CartService {

	@Autowired
	private ICartRepository cartRepo;
	
	public List<CartDTO> getAll() {
		return cartRepo.findAll(); 
	}
//
//	public List<CartDTO> getProducts(long cart_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public CartDTO findOne(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public CartDTO addCart(CartDTO cart) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void delete(CartDTO cart) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void addToCart(Long cart_id, Long product_id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public ICartRepository getCartRepo() {
//		return cartRepo;
//	}
//
//	public void setCartRepo(ICartRepository cartRepo) {
//		this.cartRepo = cartRepo;
//	}

}
