package resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Country;
import utility.Utils;

@Path("/country")
public class CountryResources {

	@GET
	@Path("/cname/{country}")
	@Produces(MediaType.APPLICATION_XML)
	public Country getCricketerDetails(@PathParam("country") String name)
	{
		System.out.println(name);
		Country cnt = Utils.doWork(name);
		System.out.println("in method");
		return cnt;
	}
	
}
