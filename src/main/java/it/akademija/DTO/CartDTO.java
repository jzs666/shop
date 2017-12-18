package it.akademija.DTO;

public class CartDTO {
	private long product_id;
	private long quantity;
	private long cart_id;
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getCart_id() {
		return cart_id;
	}
	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
	}

}
