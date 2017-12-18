package it.akademija.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.akademija.Entity.UserEntity;

public interface IUserDao extends JpaRepository<UserEntity, Long>{

	UserEntity findByusername(String name);
	
}