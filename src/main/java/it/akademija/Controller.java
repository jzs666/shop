package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController // rest valdiklis
@RequestMapping(value = "/api")
public class Controller {
	@Autowired
	private UserService userServicE;
	
	
	@RequestMapping(value = "/users")
	@GetMapping
	public List<UserDTO> getUserServicE() {
		return userServicE.getUsers();
	}


	@RequestMapping(path = "/users", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody final UserDTO user) {
		userServicE.createUser(user);
	}

	@RequestMapping(path = "/products", method = RequestMethod.GET)
	@GetMapping
	public List<ProductDTO> getProducts() {
		return userServicE.getProducts();
	}

	@RequestMapping(path = "/products", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createProducts(@RequestBody final ProductDTO product) {
		userServicE.createProducts(product);
	}

}
