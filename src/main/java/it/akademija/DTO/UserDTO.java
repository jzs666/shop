package it.akademija.DTO;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public final class UserDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String username;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;

	public UserDTO() {
	}

	public UserDTO(String username, String firstName, String lastName, String email) {
		this.username = username;
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
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