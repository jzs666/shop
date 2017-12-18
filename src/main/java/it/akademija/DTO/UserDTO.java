package it.akademija.DTO;

public class UserDTO {
	private String username;
	private long id;
	private long cart_id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getCart_id() {
		return cart_id;
	}
	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
