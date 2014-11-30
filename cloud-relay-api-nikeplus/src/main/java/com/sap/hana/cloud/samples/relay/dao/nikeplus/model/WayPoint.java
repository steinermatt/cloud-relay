package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * GPS coordinates
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/gps-data.html
 */
public class WayPoint implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The latitude value of this GPS coordinate
	 */
	@JsonProperty("latitude")
	private Float latitude;
	
	/**
	 * The longitude value of this GPS coordinate
	 */
	@JsonProperty("longitude")
	private Float longitude;

	/**
	 * The elevation value of this GPS coordinate
	 */
	@JsonProperty("elevation")
	private Float elevation;

	public Float getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Float latitude)
	{
		this.latitude = latitude;
	}

	public Float getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Float longitude)
	{
		this.longitude = longitude;
	}

	public Float getElevation()
	{
		return elevation;
	}

	public void setElevation(Float elevation)
	{
		this.elevation = elevation;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("latitude", latitude)
                .append("longitude", longitude)
                .append("elevation", elevation)
                .toString();
    }
}