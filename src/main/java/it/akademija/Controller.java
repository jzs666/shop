package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController // rest valdiklis
@RequestMapping(value = "/api/users")
public class Controller {
	@Autowired
	private UserService userServicE;

	@GetMapping
	public List<UserDTO> getUserServicE() {
		return userServicE.getUsers();
	}

	 @PostMapping
	 @ResponseStatus(HttpStatus.CREATED)
	 public void createUser(@RequestBody final UserDTO user) {
	 userServicE.createUser(user);
		 System.out.println("Test");
	 }
	 
}
