package it.akademija.DTO;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public final class UserDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String username;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;

	@OneToOne
	(cascade = {CascadeType.DETACH, CascadeType.MERGE})
	private CartDTO cartDTO;
	
	public CartDTO getCart() {
		return cartDTO;
	}

	public void setCart(CartDTO cartDTO) {
		this.cartDTO = cartDTO;
	}

	public UserDTO() {
	}

	public UserDTO(String username, String firstName, String lastName, String email, CartDTO cartDTO ) {
		this.username = username;
		this.firstName =firstName;
		this.lastName = lastName;
		this.email = email;
		this.cartDTO = cartDTO;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}