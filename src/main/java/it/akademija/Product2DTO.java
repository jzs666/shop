package it.akademija;

import javax.persistence.*;


@Entity
public class Product2DTO  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private Double price;
	@Column
	private Long quantity;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public long getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(long quantity) {
//		this.quantity = quantity;
//	}
	

}
