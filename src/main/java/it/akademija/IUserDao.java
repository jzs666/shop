package it.akademija;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IUserDao extends JpaRepository<UserDTO, Long>{
	
}