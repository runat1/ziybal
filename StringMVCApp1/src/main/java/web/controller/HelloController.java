package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	private final UserService userService;

	public HelloController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String getUsers(Model model) {
		model.addAttribute("users", userService.getListOfUsers());
		return "/users";
	}
	@GetMapping("/new")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "new";
	}

	@GetMapping("/cars")
	public String getCar(Model model, @RequestParam (value = "name") String name,@RequestParam (value = "lname") String lname) {
		model.addAttribute("user", new User(name,lname));
		return "new";
	}
	@PostMapping
	public String createUser(@ModelAttribute("user") User user) {
		userService.addUser(user);
		return "redirect:/";
	}
}