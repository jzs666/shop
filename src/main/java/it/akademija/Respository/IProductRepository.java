package it.akademija.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.akademija.DTO.ProductDTO;

@Repository
public interface IProductRepository extends JpaRepository<ProductDTO, Long> {

}

