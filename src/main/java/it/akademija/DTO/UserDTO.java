package it.akademija.DTO;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public final class UserDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;

	
	@OneToOne(mappedBy = "customer", cascade= {CascadeType.DETACH, CascadeType.MERGE})
	@JsonIgnore
	private CartDTO cartDTO;
	
	public CartDTO getCart() {
		return cartDTO;
	}

	public void setCart(CartDTO cartDTO) {
		this.cartDTO = cartDTO;
		this.cartDTO.setCustomer(this);
	}

	public UserDTO() {
	}
	
	@Override
	public String toString()
	{
		return(id.toString()+" "+this.firstName+" "+this.lastName);
	}

	public UserDTO(String firstName, String lastName) {

		this.firstName =firstName;
		this.lastName = lastName;
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