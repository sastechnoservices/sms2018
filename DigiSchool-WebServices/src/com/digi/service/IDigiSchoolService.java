package com.digi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/manage")
public interface IDigiSchoolService {
	
	 @GET
	 @Produces("text/plain")
	 @Path("/getName")
	String getStudent();

}
