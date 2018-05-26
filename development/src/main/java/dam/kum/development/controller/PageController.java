package dam.kum.development.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dam.kum.developmentbackend.dao.DoctorCategoryDAO;
import dam.kum.developmentbackend.dto.DoctorCategory;

@Controller
public class PageController {
	
	@Autowired 
	private DoctorCategoryDAO doctorcategoryDAO;

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//Passing the value of doctor category
		mv.addObject("dcategories", doctorcategoryDAO.dlist());
		
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
	
	/*
	 * 
	 * Methods to load Doctors and respective categories
	 * 
	 * */
	@RequestMapping(value = "/show/all/products" )
	public ModelAndView showAllDoctors() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Doctors");
		
		//Passing the value of doctor category
		mv.addObject("dcategories", doctorcategoryDAO.dlist());
		
		mv.addObject("userClickedAllDoctors", true);
		return mv;
	}
	
	@RequestMapping(value = "/show/dcategory/{id}/products" )
	public ModelAndView showDoctorsCategory(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");
		
		//DoctorsCategory to fetch a single Category
		DoctorCategory dcategory = null;
		dcategory = doctorcategoryDAO.get(id);
		
		mv.addObject("title", dcategory.getName());
		
		//Passing the value of doctor category
		mv.addObject("dcategory", dcategory);
		
		mv.addObject("userClickedCategoryDoctors", true);
		return mv;
	}

}
