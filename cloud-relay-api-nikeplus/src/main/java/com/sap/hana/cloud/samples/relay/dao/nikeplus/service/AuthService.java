package com.sap.hana.cloud.samples.relay.dao.nikeplus.service;

import org.codegist.crest.annotate.Consumes;
import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.FormParam;
import org.codegist.crest.annotate.POST;
import org.codegist.crest.annotate.Path;

import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.AuthData;

@EndPoint("https://developer.nike.com")
@Path("/services/login")
@Consumes("application/json")
public interface AuthService
{
	/**
	 * Authenticates the specified user against Nike+ and returns the respective authentication data 
	 * (including the access token required by the rest of the API).
	 * 
	 * @param username The username/email of the user
	 * @param password The password of the user
	 * @return The respective authentication data (incl. the acess token)
	 */
	@POST
	AuthData login(@FormParam("username") String username, @FormParam("password") String password);				
}