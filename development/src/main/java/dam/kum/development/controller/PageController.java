package dam.kum.development.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickedHome", true);
		return mv;
	}
		
	@RequestMapping(value = "/doctors")
	public ModelAndView doctors() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "View Doctors");
		mv.addObject("userClickedDoctors", true);
		return mv;
	}
	
	@RequestMapping(value = "/services")
	public ModelAndView services() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Medical Services");
		mv.addObject("userClickedServices", true);
		return mv;
	}
	
	@RequestMapping(value = "/ambulance")
	public ModelAndView ambulance() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Ambulance");
		mv.addObject("userClickedAmbulance", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickedContact", true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickedAbout", true);
		return mv;
	}
	
	

}
