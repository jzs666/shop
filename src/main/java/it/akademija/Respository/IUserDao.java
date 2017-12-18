package it.akademija.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.akademija.DTO.UserDTO;

@Repository
public interface IUserDao extends JpaRepository<UserDTO, Long>{
	
}