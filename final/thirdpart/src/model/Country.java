package model;

import javax.xml.bind.annotation.XmlElement;

//@XmlRootElement
public class Country 
{
	private String country;
	private String capital;
	private String currency;
	
	//@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	//@XmlElement
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//@XmlElement
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
public Country() {
		
	}

	public Country(String country, String capital, String currency) {
		super();
		this.country = country;
		this.capital = capital;
		this.currency = currency;
	}
	@Override
	public String toString() {
		
		return "Country [country=" + country + ", capital=" + capital + ", currency=" + currency  +"]";
	}
}
