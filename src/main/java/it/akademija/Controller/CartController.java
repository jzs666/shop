package it.akademija.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import it.akademija.DTO.CartDTO;
import it.akademija.DTO.ProductDTO;
import it.akademija.Service.CartService;

import java.util.List;


@RestController
@RequestMapping(value = "/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<CartDTO> getAll(){
        return cartService.getAll();
    }
//    @RequestMapping(value = "/{cart_id}/products", method = RequestMethod.GET)
//    public List<ProductDTO> getProductInCart(@PathVariable long cart_id){
//        return cartService.getProducts(cart_id);
//    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CartDTO addCart(@RequestBody final CartDTO cart){
        return cartService.addCart(cart);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CartDTO getCart(@PathVariable final long id){
        return cartService.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable final long id){
        CartDTO cart = cartService.findOne(id);
        cartService.delete(cart);
    }

//    @RequestMapping(value = "/add/{product_id}/to/{cart_id}", method = RequestMethod.POST)
//    public void addProduct(@PathVariable Long product_id, @PathVariable Long cart_id){
//
//        //cartService.addProduct(product_id, cart_id);
//        cartService.addToCart(cart_id,product_id);
//    }
}
