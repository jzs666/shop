package it.akademija.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity customer;
  
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "products_CartDTO",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "CartDTO_id",
                    referencedColumnName = "id"))
     private List<ProductEntity> products;

    
  	public UserEntity getCustomer() {
  		return customer;
  	}

  	public void setCustomer(UserEntity userEntity) {
  		this.customer = userEntity;
  	}

    
    public CartEntity(){

    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }


}

