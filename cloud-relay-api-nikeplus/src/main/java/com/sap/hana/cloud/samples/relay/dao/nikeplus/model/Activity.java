package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;
import java.util.Date;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Object representing a single user activity.
 * 
 * Distances and weights are returned in metric units. Dates and times are returned in UTC following ISO8601 standard formats.
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
 * @see https://developer.nike.com/documentation/api-docs/activity-services/activity-detail.html
 * @see https://api.nike.com/v1/schemas/Activity.json
 */
public class Activity implements Serializable
{
	/**
	 * The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The list of links to related resources
	 */
	@JsonProperty("links")
	private Link[] links;
	
	/**
	 * The Sport Activity unique identifier
	 */
	@JsonProperty("activityId")
	private String id;

	/**
	 * The type of Activity performed, e.g. RUN, WALK, CYCLE, SESSION, ALL_DAY
	 * 
	 * @see https://developer.nike.com/documentation/api-docs/reference/activity-types.html
	 */
	@JsonProperty("activityType")
	private String type;

	/**
	 * The Activity's start time in UTC, standard ISO8601 format
	 */
	@JsonProperty("startTime")
	private Date startTime;

	/**
	 * Timezone the Activity was captured in
	 */
	@JsonProperty("activityTimeZone")
	private String timeZone;

	/**
	 * The status of the Activity, e.g. IN_PROGRESS, COMPLETED. This field always shows IN_PROGRESS for the Fuelband2 device type. Will be deprecated in future.
	 */
	@JsonProperty("status")
	private String status;

	/**
	 * Device used to record the Activity
	 */
	@JsonProperty("deviceType")
	private String deviceType;
	
	/**
	 * Object containing summary metric data for the Activity
	 * 
	 * @see MetricSummary
	 */
	@JsonProperty("metricSummary")
	private MetricSummary metricSummary;
	
	/**
	 * Array of {@link Tag} Objects
	 * 
	 * @see Tag
	 */
	@JsonProperty("tags")
	private Tag[] tags;
	
	/**
	 * Array of metrics
	 */
	@JsonProperty("metrics")
	private Metric[] metrics;
	
	/**
	 * Whether this Activity contains GPS data
	 */
	@JsonProperty("isGpsActivity")
	private Boolean isGpsActivity;
	
	/**
	 * Object that contains pagination links
	 */
	@JsonProperty("paging")
	private Paging paging;
	
	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}

	public String getTimeZone()
	{
		return timeZone;
	}

	public void setTimeZone(String timeZone)
	{
		this.timeZone = timeZone;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getDeviceType()
	{
		return deviceType;
	}

	public void setDeviceType(String deviceType)
	{
		this.deviceType = deviceType;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
	public MetricSummary getMetricSummary()
	{
		return metricSummary;
	}

	public void setMetricSummary(MetricSummary metricSummary)
	{
		this.metricSummary = metricSummary;
	}

	public Tag[] getTags()
	{
		return tags;
	}

	public void setTags(Tag[] tags)
	{
		this.tags = tags;
	}

	public Link[] getLinks()
	{
		return links;
	}

	public void setLinks(Link[] links)
	{
		this.links = links;
	}

	public Metric[] getMetrics()
	{
		return metrics;
	}

	public void setMetrics(Metric[] metrics)
	{
		this.metrics = metrics;
	}

	public Boolean getIsGpsActivity()
	{
		return isGpsActivity;
	}

	public void setIsGpsActivity(Boolean isGpsActivity)
	{
		this.isGpsActivity = isGpsActivity;
	}

	public Paging getPaging()
	{
		return paging;
	}

	public void setPaging(Paging paging)
	{
		this.paging = paging;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("id", id)
                .append("type", type)
                .append("startTime", startTime)
                .append("timeZone", timeZone)
                .append("status", status)
                .append("deviceType", deviceType)
                .append("metricSummary", metricSummary)
                .append("tags", tags)
                .toString();
    }

}
