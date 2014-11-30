package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * GPS data for the user's activities, specified by its Activity ID. GPS details include 
 * coordinates expressed as latitude, longitude and elevation.
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/gps-data.html
 * @see https://api.nike.com/v1/schemas/ActivityGps.json
 */
public class ActivityGPSData implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The list of links to related resources
	 */
	@JsonProperty("links")
	private Link[] links;

	/**
	 * The total elevation loss over all the provided coordinates
	 */
	@JsonProperty("elevationLoss")
	private Float elevationLoss;

	/**
	 * The total elevation gain over all the provided coordinates
	 */
	@JsonProperty("elevationGain")
	private Float elevationGain;
	
	/**
	 * The maximum elevation value
	 */
	@JsonProperty("elevationMax")
	private Float elevationMax;
	
	/**
	 * The minimum elevation value
	 */
	@JsonProperty("elevationMin")
	private Float elevationMin;
	
	/**
	 * The interval at which the GPS coordinate values were sampled
	 */
	@JsonProperty("intervalMetric")
	private Float intervalMetric;
	
	/**
	 * The unit with which the GPS coordinate values were sampled, e.g. SEC for seconds
	 */
	@JsonProperty("intervalUnit")
	private String intervalUnit;
	
	/**
	 * Array of {WAYPOINT} Objects
	 */
	@JsonProperty("waypoints")
	private WayPoint[] waypoints;

	public Link[] getLinks()
	{
		return links;
	}

	public void setLinks(Link[] links)
	{
		this.links = links;
	}

	public Float getElevationLoss()
	{
		return elevationLoss;
	}

	public void setElevationLoss(Float elevationLoss)
	{
		this.elevationLoss = elevationLoss;
	}

	public Float getElevationGain()
	{
		return elevationGain;
	}

	public void setElevationGain(Float elevationGain)
	{
		this.elevationGain = elevationGain;
	}

	public Float getElevationMax()
	{
		return elevationMax;
	}

	public void setElevationMax(Float elevationMax)
	{
		this.elevationMax = elevationMax;
	}

	public Float getElevationMin()
	{
		return elevationMin;
	}

	public void setElevationMin(Float elevationMin)
	{
		this.elevationMin = elevationMin;
	}

	public Float getIntervalMetric()
	{
		return intervalMetric;
	}

	public void setIntervalMetric(Float intervalMetric)
	{
		this.intervalMetric = intervalMetric;
	}

	public String getIntervalUnit()
	{
		return intervalUnit;
	}

	public void setIntervalUnit(String intervalUnit)
	{
		this.intervalUnit = intervalUnit;
	}

	public WayPoint[] getWaypoints()
	{
		return waypoints;
	}

	public void setWaypoints(WayPoint[] waypoints)
	{
		this.waypoints = waypoints;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("links", links)
                .append("elevationLoss", elevationLoss)
                .append("elevationGain", elevationGain)
                .append("elevationMax", elevationMax)
                .append("elevationMin", elevationMin)
                .append("intervalMetric", intervalMetric)
                .append("intervalUnit", intervalUnit)
                .append("waypoints", waypoints)
                .toString();
    }
	
}