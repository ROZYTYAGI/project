package com.niit.training.dao;

import java.util.List;

public interface AirportDao {
	void add(Airport airport);

	List<Airport> listAll();

	void delete(String airportcode);

	Airport get(String airportcode);
	
	void update(Airport airport);

}
