package it.akademija.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.akademija.DTO.CartDTO;

public interface ICartRepository extends JpaRepository<CartDTO, Long> {

}
