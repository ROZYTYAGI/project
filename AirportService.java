package com.niit.training.services;
import java.util.List;

import com.niit.training.dao.Airport;

public interface AirportService {
	void addAirport(final String city,final String code, final String name);
	List<Airport> listAirport();
      Airport get(final String airportcode);
	void deleteAirport(String airportcode);
	void updateAirport(String code, String name);
	boolean findAirport(final String airportcode);
	boolean validateAirport(String airportcode, String airportname);
	Airport findAirportObj(final String airportcode);
}
