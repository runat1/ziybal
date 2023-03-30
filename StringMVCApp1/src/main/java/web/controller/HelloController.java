package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);

		return "index";
	}
	@GetMapping("/new")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "new";
	}

}