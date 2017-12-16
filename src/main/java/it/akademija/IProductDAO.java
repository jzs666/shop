package it.akademija;

import org.springframework.data.jpa.repository.JpaRepository;
public interface IProductDAO extends JpaRepository<Product2DTO, Long> {

}
