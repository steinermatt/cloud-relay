package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Object that contains pagination links
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
 */
public class Paging implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The request that will return the next page of Activities
	 */
	@JsonProperty("next")
	private String next;

	/**
	 * The request that will return the previous page of Activities
	 */
	@JsonProperty("previous")
	private String previous;

	public String getNext()
	{
		return next;
	}

	public void setNext(String next)
	{
		this.next = next;
	}

	public String getPrevious()
	{
		return previous;
	}

	public void setPrevious(String previous)
	{
		this.previous = previous;
	}
}