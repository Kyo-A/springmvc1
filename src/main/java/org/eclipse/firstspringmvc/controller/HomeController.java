package org.eclipse.firstspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
//	@RequestMapping(value="/hello", method = RequestMethod.GET)
//	@GetMapping(value = "/hello")
//	public void sayHello() {
//		System.out.println("Hello");
//	}

	// localhost:8080/firstspringmvc/home/hello?page=0&number=1
	@GetMapping(value = "/hello")
	public void sayHello(@RequestParam(value = "nom", required = false, defaultValue = "Wick") String nom) {
		System.out.println("Hello" + nom);
	}
	
	// localhost:8080/firstspringmvc/home/hello2/Wick
	@GetMapping(value = "/hello2/{nom}")
	public void sayHello2(@PathVariable String nom) {
		System.out.println("Hello" + nom);
	}
	// 3 facons differentes de transmettre des donnees d'un controlleur a une vue
	
	// http://localhost:8080/first-spring-mvc/home/helloJsp
//	@GetMapping(value = "/helloJsp")
//	public String Hello(Model model) {
//		model.addAttribute("nom", "Wick");
//		return "hello";
//	}
//	
//	@GetMapping(value = "/helloJsp")
//	public String Hello(ModelMap model) {
//		model.addAttribute("nom", "Wick");
//		return "hello";
//	}
	
	@GetMapping(value = "/helloJsp")
	public ModelAndView Hello(ModelAndView model) {
		model.setViewName("hello");
		model.addObject("nom", "Wick");
		return model;
	}

}
