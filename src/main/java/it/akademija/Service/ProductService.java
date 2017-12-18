package it.akademija.Service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.akademija.Entity.ProductEntity;
import it.akademija.Respository.IProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private IProductRepository productRepo;
	public List<ProductEntity> getProducts() {
		return productRepo.findAll();
	}
	
	@PostConstruct
	void PostConstructor() {
		productRepo.save(new ProductEntity("Samsung", "Description", "./Samsung.jpg", 222.55, 20));
		productRepo.save(new ProductEntity("Samsung", "Description", "./Samsung.jpg", 9.55, 15));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 2.55, 10));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 322.0, 10));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 213.0, 4));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 100.55, 20));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 223.5, 3));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 222, 5));
		productRepo.save(new ProductEntity("Nokia", "Description", "./Samsung.jpg", 35.50, 10));
	}
        
	public ProductEntity getProductById(long id) {

		return 	productRepo.findOne(id);
	}

	public ProductEntity createProduct(ProductEntity product) {
		return productRepo.save(product);
	}

	public ProductEntity remove(long id) {
		productRepo.delete(id);
		return null;
	}

	public void addProduct(long product_id, long brand_id) {
		System.out.println(product_id+brand_id);
	}

	public void update(ProductEntity oldOne, ProductEntity product) {
		ProductEntity product1 = productRepo.findOne(oldOne.getId());
		product1.setDescription(product.getDescription());
		product1.setImage(product.getImage());
		product1.setPrice(product.getPrice());
		product1.setQuantity(product.getQuantity());
		productRepo.save(product1);
	}

}
