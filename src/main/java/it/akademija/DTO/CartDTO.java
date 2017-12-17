package it.akademija.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CartDTOs")
public class CartDTO {

    @Id
    @GeneratedValue
    private Long id;

//    @OneToOne(mappedBy = "CartDTO", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Customer customer;
//
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "products_CartDTO",
//            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "CartDTO_id",
//                    referencedColumnName = "id"))
//    private List<Product> products;
//
//    public CartDTO(){
//
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }


}

