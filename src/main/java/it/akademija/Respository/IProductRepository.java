package it.akademija.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.akademija.DTO.ProductDTO;
public interface IProductRepository extends JpaRepository<ProductDTO, Long> {

}

