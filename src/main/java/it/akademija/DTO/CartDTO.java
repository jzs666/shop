package it.akademija.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartDTO implements Serializable{

    @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne (cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "ID")
    private UserDTO customer;
  
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "products_CartDTO",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "CartDTO_id",
                    referencedColumnName = "id"))
     private List<ProductDTO> products;

    
  	public UserDTO getCustomer() {
  		return customer;
  	}

  	public void setCustomer(UserDTO customer) {
  		this.customer = customer;
  	}

    
    public CartDTO(){

    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }


}

