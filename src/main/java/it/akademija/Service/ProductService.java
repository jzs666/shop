package it.akademija.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.akademija.DTO.ProductDTO;
import it.akademija.Respository.IProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private IProductRepository productRepo;
	public List<ProductDTO> getProducts() {
		return productRepo.findAll();
	}
	
//	public ProductDTO getProductById(long id) {
//
//		return 	productRepo.findOne(id);
//	}
//
//	public ProductDTO createProduct(ProductDTO product) {
//		return productRepo.save(product);
//	}
//
//	public ProductDTO remove(ProductDTO productById) {
//		productRepo.delete(productById);
//		return null;
//	}
//
//	public void addProduct(long product_id, long brand_id) {
//		System.out.println(product_id+brand_id);
//	}
//
//	public ProductDTO update(ProductDTO oldOne, ProductDTO product) {
//		return new ProductDTO();
//	}

}
