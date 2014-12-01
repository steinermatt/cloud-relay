package com.sap.hana.cloud.samples.relay.model;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "trkpt")
public class GPXTrackPoint
{
	@Attribute(name = "lat")
	String latitude = null;
	
	@Attribute(name = "lon")
	String longitute = null;

	@Element(name = "ele", required=false)
	String elevation = null;
	
	@Element(name = "time", required=false)
	Date time = null;

	public String getLatitude()
	{
		return latitude;
	}

	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}

	public String getLongitute()
	{
		return longitute;
	}

	public void setLongitute(String longitute)
	{
		this.longitute = longitute;
	}

	public String getElevation()
	{
		return elevation;
	}

	public void setElevation(String elevation)
	{
		this.elevation = elevation;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

}
