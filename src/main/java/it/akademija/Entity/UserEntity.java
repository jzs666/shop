package it.akademija.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public final class UserEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String username;

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval=true)
	private CartEntity cartEntity;
	
	public CartEntity getCart() {
		return cartEntity;
	}

	public void setCart(CartEntity cartEntity) {
		this.cartEntity = cartEntity;
		cartEntity.setCustomer(this);
	}

	public UserEntity() {
	}

	public UserEntity(String username,  CartEntity cartEntity ) {
		this.username = username;
		this.setCart(cartEntity);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public CartEntity getCartEntity() {
		return cartEntity;
	}

	public void setCartEntity(CartEntity cartEntity) {
		this.cartEntity = cartEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
}