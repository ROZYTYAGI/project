package com.niit.training.services;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.training.dao.Airport;
import com.niit.training.dao.AirportDao ;

@Transactional
@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	 AirportDao airportDao;
    @Transactional
	@Override
	public void addAirport(final String airportcity,final String airportcode, final String airportname) {
		airportDao.add(new Airport(airportcity,airportcode, airportname));
	}

	public List<Airport> listAirport() {
		return airportDao.listAll();
	}

	@Override
	public void deleteAirport(String airportcode) {
	airportDao.delete(airportcode);	
	}

	

	@Override
	public boolean findAirport(final String airportcode) {
		return false;
	}
	@Override
	public boolean validateAirport(String airportcode, String airportname) {
		
		return validate(airportcode, airportname);
	}

	private boolean validate(final String airportcode, final String airportname) {
		return false;
	}

	
    @Override
	public Airport findAirportObj(final String airportcode) {
		
		return null;
	}

	@Override
	public Airport get(String airportcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAirport(String code, String name) {
		// TODO Auto-generated method stub
		
	}

}