package it.akademija.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.akademija.DTO.CartDTO;

@Repository
public interface ICartRepository extends JpaRepository<CartDTO, Long> {

}
