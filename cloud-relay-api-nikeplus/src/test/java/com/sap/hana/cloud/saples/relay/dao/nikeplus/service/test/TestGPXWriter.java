package com.sap.hana.cloud.saples.relay.dao.nikeplus.service.test;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.strategy.TreeStrategy;

import com.sap.hana.cloud.samples.relay.model.GPXData;


/**
 * 
 */

public class TestGPXWriter
{
	
	@BeforeClass
    public static void oneTimeSetUp() throws IOException
	{
		// one-time setup code
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
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testGPXWriter() throws Exception 
	{
		GPXData gpxData = new GPXData();
		
		Strategy strategy = new TreeStrategy("clazz", null); // clazz substitute for class,

		
		Serializer serializer = new Persister(strategy);
		File result = new File("example.gpx");

		serializer.write(gpxData, result);
		
	}
	
}
