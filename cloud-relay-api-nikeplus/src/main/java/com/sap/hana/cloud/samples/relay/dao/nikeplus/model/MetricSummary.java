package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Object containing summary metric data for the Activity
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
 */
public class MetricSummary implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Number of calories burned during the Activity
	 */
	@JsonProperty("calories")
	private String calories;

	/**
	 * Amount of NikeFuel gained during the Activity
	 */
	@JsonProperty("fuel")
	private String fuel;

	/**
	 * Distance traveled during the Activity
	 */
	@JsonProperty("distance")
	private String distance;

	/**
	 * Number of steps taken during the Activity
	 */
	@JsonProperty("steps")
	private String steps;

	/**
	 * The amount of time the Activity lasted in the format Hours:Minutes:Seconds.Milliseconds
	 */
	@JsonProperty("duration")
	private String duration;

	public String getCalories()
	{
		return calories;
	}

	public void setCalories(String calories)
	{
		this.calories = calories;
	}

	public String getFuel()
	{
		return fuel;
	}

	public void setFuel(String fuel)
	{
		this.fuel = fuel;
	}

	public String getDistance()
	{
		return distance;
	}

	public void setDistance(String distance)
	{
		this.distance = distance;
	}

	public String getSteps()
	{
		return steps;
	}

	public void setSteps(String steps)
	{
		this.steps = steps;
	}

	public String getDuration()
	{
		return duration;
	}

	public void setDuration(String duration)
	{
		this.duration = duration;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("calories", calories)
                .append("fuel", fuel)
                .append("distance", distance)
                .append("steps", steps)
                .append("duration", duration)
                .toString();
    }
}