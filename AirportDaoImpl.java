package com.niit.training.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AirportDaoImpl implements AirportDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Airport airport) {
		Session session = sessionFactory.getCurrentSession();
		session.save(airport);
	}

	@Override
	public List<Airport> listAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Airport").list();
	}

	@Override
	public void delete(final String airportcode) {
		Airport airport=getAirportByCode(airportcode);
		this.sessionFactory.getCurrentSession().delete(airport);
	}

	private Airport getAirportByCode(String airportcode) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		return (Airport) session.get(Airport.class, airportcode);
	}

	@Override
	public Airport get(String airportcode) {
		Session session = sessionFactory.getCurrentSession();
		return null;
	}

	@Override
	public void update(Airport airport) {
		// TODO Auto-generated method stub
		
	}

}
