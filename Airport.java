package com.niit.training.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="airport")
public class Airport implements Serializable {
	
public Airport() {
		super();
	}
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


@Column(name = "airportcity", nullable = false)
private String airportcity;
@Id
@Column(name = "airportcode")
private String airportcode;
@Column(name = "airportname", nullable = false)
private String airportname;



public Airport(String airportcity, String airportcode, String airportname) {
	// TODO Auto-generated constructor stub
	super();
	this.airportcity=airportcity;
	this.airportcode=airportcode;
	this.airportname=airportname;

}
public String getAirportcode() {
	return airportcode;
}
public  void setAirportcode(String airportcode) {
	this.airportcode = airportcode;
}
public String getAirportname() {
	return airportname;
}
public void setAirportname(String airportname) {
	this.airportname = airportname;
}
public String getAirportcity() {
	return airportcity;
}
public void setAirportcity(String airportcity) {
	this.airportcity = airportcity;
}
@Override
public String toString() {
	return "Airport [ airportcity=" + airportcity + ",airportcode=" + airportcode + ", airportname=" + airportname +  "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((airportcity == null) ? 0 : airportcity.hashCode());
	result = prime * result + ((airportcode == null) ? 0 : airportcode.hashCode());
	result = prime * result + ((airportname == null) ? 0 : airportname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Airport other = (Airport) obj;
	if (airportcity == null) {
		if (other.airportcity != null)
			return false;
	} else if (!airportcity.equals(other.airportcity))
		return false;
	if (airportcode == null) {
		if (other.airportcode != null)
			return false;
	} else if (!airportcode.equals(other.airportcode))
		return false;
	if (airportname == null) {
		if (other.airportname != null)
			return false;
	} else if (!airportname.equals(other.airportname))
		return false;
	return true;
}




}
