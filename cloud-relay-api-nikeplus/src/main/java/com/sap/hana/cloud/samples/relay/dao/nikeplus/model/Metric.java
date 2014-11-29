package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Extra details the user entered about the Activity
 * 
 * @see https
 *      ://developer.nike.com/documentation/api-docs/activity-services/list-
 *      activities.html
 */
public class Metric implements Serializable
{
	/**
	 * The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The interval with which the metric's values were sampled
	 */
	@JsonProperty("intervalMetric")
	private Integer intervalMetric;

	/**
	 * The unit with which the metric's values were sampled, e.g. "SEC" for
	 * seconds
	 */
	@JsonProperty("intervalUnit")
	private String intervalUnit;

	/**
	 * The type of thing the metric is measuring. See Metric Types
	 */
	@JsonProperty("metricType")
	private String metricType;

	/**
	 * The stream of samples for the metric. Please note that the "DISTANCE"
	 * metrics returned will be cumulative since the beginning of the activity.
	 */
	@JsonProperty("values")
	private String[] values;

	public Integer getIntervalMetric()
	{
		return intervalMetric;
	}

	public void setIntervalMetric(Integer intervalMetric)
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

	public String getMetricType()
	{
		return metricType;
	}

	public void setMetricType(String metricType)
	{
		this.metricType = metricType;
	}

	public String[] getValues()
	{
		return values;
	}

	public void setValues(String[] values)
	{
		this.values = values;
	}

}