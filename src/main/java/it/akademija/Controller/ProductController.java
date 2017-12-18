package it.akademija.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import it.akademija.DTO.ProductDTO;
import it.akademija.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public List<ProductDTO> getProducts(){
        return productService.getProducts();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping
    public ProductDTO getProductById(@PathVariable long id){
        return productService.getProductById(id);

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO createNewProduct(@Valid @RequestBody final ProductDTO product){
        return productService.createProduct(new ProductDTO());
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void removeProductById(@PathVariable final Long id){
        productService.remove(productService.getProductById(id));
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ProductDTO updateProductById(@PathVariable long id, @RequestBody final ProductDTO product){
        ProductDTO oldOne = productService.getProductById(id);
        if(oldOne == null){
            throw new NullPointerException();
        }
        return productService.update(oldOne, product);
    }

    @RequestMapping(value = "/{product_id}/brand/{brand_id}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addBrandToProduct(@PathVariable long product_id, @PathVariable long brand_id){
        productService.addProduct(product_id, brand_id);
    }


}

