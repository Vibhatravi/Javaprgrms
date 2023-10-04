package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json/service")	
public class JSONServices {
	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getApplication() {
		Product pr=new Product();
		pr.setName("Ipod");
		pr.setId(1);
		return pr;
	}
	
//	@POST
//	@Path("/post")
//	@Consumes("application/json")
//	public Product postApplication() {
//		Product pr=new Product();
//		pr.setName("Ipod2");
//		pr.setId(2);
//		return pr;
//	}
	
	@POST
	@Path("/post")
	@Consumes("application/json")
	@Produces("application/json")
	public Product postApplication() {
	    System.out.println("POST request received.");
	    Product pr = new Product();
	    pr.setName("Ipod2");
	    pr.setId(2);
	    System.out.println("Returning product: " + pr.toString());
	    return pr;
	}
}

