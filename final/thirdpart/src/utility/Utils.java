package utility;

import model.Country;


public class Utils {

	
	public static Country doWork(String country){
		
		Country cntry = new Country();
		cntry.setCountry(country);
		if(country.equals("india"))
		{
			cntry.setCapital("Delhi");
			cntry.setCurrency("Rupees");
		}
		else if(country.equals("usa"))
		{
			cntry.setCapital("New York");
			cntry.setCurrency("US Dollars");
		}
		else
		{
			return null;
		}
		
		return cntry;
	}
	
}
