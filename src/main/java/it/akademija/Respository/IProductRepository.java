package it.akademija.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.akademija.Entity.ProductEntity;
public interface IProductRepository extends JpaRepository<ProductEntity, Long> {

}

