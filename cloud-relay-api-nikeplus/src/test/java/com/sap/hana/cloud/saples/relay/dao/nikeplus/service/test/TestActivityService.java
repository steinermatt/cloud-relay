package com.sap.hana.cloud.saples.relay.dao.nikeplus.service.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.codegist.crest.CRest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.Activities;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.Activity;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.ActivityGPSData;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.AuthData;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.service.ActivityService;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.service.AuthService;


/**
 * Tests for the {@link ActivityService} class.  
 */

public class TestActivityService
{

	static String accessToken = null;
	
	@BeforeClass
    public static void oneTimeSetUp() throws IOException
	{
        login();      
    }
	
	@AfterClass
    public static void oneTimeTearDown() 
	{
        // one-time cleanup code
    }

	
	@Before
	public void setUp() throws Exception 
	{
		// nothing needs to be done here
	}

	@After
	public void tearDown() throws Exception 
	{
		// nothing needs to be done here
	}
	

	
	/**
	 * 
	 */
	@Test
	public void testListActivities() 
	{
		// get a CRest instance
		CRest crest = CRest.getInstance();

		// get an ActivityService instance
		ActivityService activityService = crest.build(ActivityService.class);
		
		Activities activities = activityService.listActivities(accessToken, 5, null, null, null);
		
		System.out.println(activities);
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetActiviyDetail() 
	{
		// get a CRest instance
		CRest crest = CRest.getInstance();

		// get an ActivityService instance
		ActivityService activityService = crest.build(ActivityService.class);
		
		Activities activities = activityService.listActivities(accessToken, 1, null, null, null);

		if (activities != null && activities.getActivities().length > 0)
		{
			Activity activity = activities.getActivities()[0];
			String activityID = activity.getId();
			
			activity = activityService.getActivityDetail(activityID, accessToken);
			
			System.out.println(activity);
		}
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetActiviyGPSData() 
	{
		// get a CRest instance
		CRest crest = CRest.getInstance();

		// get an ActivityService instance
		ActivityService activityService = crest.build(ActivityService.class);
		
		Activities activities = activityService.listActivities(accessToken, 1, null, null, null);

		if (activities != null && activities.getActivities().length > 0)
		{
			Activity activity = activities.getActivities()[0];
			String activityID = activity.getId();
			
			activity = activityService.getActivityDetail(activityID, accessToken);
			
			if (activity.getIsGpsActivity() != null && activity.getIsGpsActivity())
			{
				ActivityGPSData gpsData = activityService.getGPSData(activityID, accessToken);
				System.out.println(gpsData);
			}
			
		}
	}
	
	
	private static void login() throws IOException
	{
		Properties props = new Properties();

		InputStream is = ClassLoader.getSystemResourceAsStream("credentials.properties");
		
		props.load(is);
		  
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		  
		// get a CRest instance
		CRest crest = CRest.getInstance();

		// get an ActivityService instance
		AuthService authService = crest.build(AuthService.class);
		
		AuthData authData = authService.login(username, password);
		accessToken = authData.getAccessToken();
	}
}
