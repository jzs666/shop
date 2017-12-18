package it.akademija.Service;

import java.util.List;

import javax.annotation.PostConstruct;

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
	
	@PostConstruct
	void postConstruct(){
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 10.0, 20));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 13.5, 50));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 10.0, 20));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 40.0, 100));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 12.0, 40));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 2.0, 23));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 15.0, 5));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 10.0, 30));
		productRepo.save(new ProductDTO("Samsung", "Labai geras", 1.0, 2));
		
	}
	public ProductDTO getProductById(long id) {

		return 	productRepo.findOne(id);
	}

	public ProductDTO createProduct(ProductDTO product) {
		return productRepo.save(product);
	}

	public void remove(ProductDTO productById) {
				productRepo.delete(productById);
	}

	public void addProduct(long product_id, long brand_id) {
		System.out.println(product_id+brand_id);
	}

	public ProductDTO update(ProductDTO oldOne, ProductDTO product) {
		return new ProductDTO();
	}

}
