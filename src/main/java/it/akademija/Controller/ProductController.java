package it.akademija.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import it.akademija.Entity.ProductEntity;
import it.akademija.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public List<ProductEntity> getProducts(){
        return productService.getProducts();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping
    public ProductEntity getProductById(@PathVariable long id){
        return productService.getProductById(id);

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity createNewProduct(@Valid @RequestBody final ProductEntity product){
        return productService.createProduct(new ProductEntity());
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity removeProductById(@PathVariable final long id){
        return productService.remove(id);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateProductById(@PathVariable long id, @RequestBody final ProductEntity product){
        ProductEntity oldOne = productService.getProductById(id);
        if(oldOne == null){
            throw new NullPointerException();
        }
        productService.update(oldOne, product);
    }

//    @RequestMapping(value = "/{product_id}/brand/{brand_id}", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.OK)
//    public void addBrandToProduct(@PathVariable long product_id, @PathVariable long brand_id){
//        productService.addProduct(product_id, brand_id);
//    }


}

