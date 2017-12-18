package it.akademija.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import it.akademija.DTO.ProductDTO;
import it.akademija.DTO.UserDTO;
import it.akademija.Service.UserService;

import org.springframework.http.HttpStatus;

@RestController // rest valdiklis
@RequestMapping(value = "/api/users")
public class Controller {
	@Autowired
	private UserService userServicE;
	
	
	@RequestMapping(value = "/")
	@GetMapping
	public List<UserDTO> getUserServicE() {
		return userServicE.getUsers();
	}


	@RequestMapping(path = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody final UserDTO user) {
		userServicE.createUser(user);
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	@GetMapping
	public List<ProductDTO> getProducts() {
		return userServicE.getProducts();
	}

	@RequestMapping(path = "/cart-details", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createProducts(@RequestBody final ProductDTO product) {
		userServicE.createProducts(product);
	}

}
