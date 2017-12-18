package it.akademija.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.akademija.Entity.CartEntity;
import it.akademija.Entity.ProductEntity;

public interface ICartRepository extends JpaRepository<CartEntity, Long> {

//	List<CartDTO> findAllByProductId(long product_id);

}
