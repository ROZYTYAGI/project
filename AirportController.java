package com.niit.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.niit.training.dao.Airport;

import com.niit.training.services.AirportService;


@Controller
@SessionAttributes()
public class AirportController {
	@Autowired
	AirportService service;
@RequestMapping(value = "/airport", method = RequestMethod.POST)
	public ModelAndView addAirprot(@RequestParam String airportcity, 
			@RequestParam String airportcode,
			@RequestParam String airportname) {
		if(service.findAirport(airportcode)) {
			String msgValue = "Airport"+airportcode+" already present.";
			return new ModelAndView("addairport", "errorMessage", msgValue);
		}
		else {
			service.addAirport(airportcity,airportcode, airportname);
			String msgValue = "Airport with "+airportname+" added.";
			return new ModelAndView("addairport", "welcomeMessage", msgValue);
		}
	}
	
	@RequestMapping(value = "/addAirport", method = RequestMethod.GET)
	public String addAirprotPage() {
		return "airportadded";
	}
	
	@RequestMapping(value = "/airport", method = RequestMethod.GET)
	public ModelAndView displayAirport() {
		
		return new ModelAndView("airport","airport",service.listAirport());
	}
	@RequestMapping(value = "/deleteAirport", method = RequestMethod.GET)
	public ModelAndView deleteAirport(@RequestParam String airportcode) {
		service.deleteAirport(airportcode);
		
		ModelAndView view = new ModelAndView("airport");
		view.addObject("airport",service.listAirport());
		view.addObject("message","Airport updated successfully");
		return view;
	}
	@RequestMapping(value = "/editAirport", method = RequestMethod.POST)
	public ModelAndView editAirportSubmit(@RequestParam String airportcode,
			@RequestParam  String airportname ,
			@RequestParam  String airportnewname
			) {
		
		Airport airport = service.findAirportObj(airportcode);
		if(airport == null) {
			ModelAndView airportVire = new ModelAndView(
					"airport");
			airportVire.addObject("airport",service.listAirport());
			airportVire.addObject("errorMessage","Invalid airport to edit");
			return airportVire;
		}
		if(!airport.getAirportname().equals(airportname)) {
			ModelAndView view = new ModelAndView("edit");
			view.addObject("airport",airport);
			view.addObject("message","Invalid Current name");
			return view;
		}
		service.updateAirport(airportcode,airportnewname);
		ModelAndView view = new ModelAndView("airport");
		view.addObject("airport", service.listAirport());
		view.addObject("message","Airport updated successfully");
			
		return view;

	}
	
	@RequestMapping(value = "/editAirport", method = RequestMethod.GET)
	public ModelAndView updateAirport(@RequestParam String airportcode) {
		Airport airport = service.findAirportObj(airportcode);
		ModelAndView view = new ModelAndView("edit");
		view.addObject("airport",airport);
		return view;

	}
	
	@RequestMapping(value = "/listAirport", method = RequestMethod.GET)
	public ModelAndView listAirport() {
		
		return new ModelAndView("Airport","airport",service.listAirport());
	}
	
}



