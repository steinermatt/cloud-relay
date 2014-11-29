package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The list of links to related resources
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
 */
public class Link implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The type of relationship to the referenced object 
	 */
	@JsonProperty("rel")
	private String rel;

	/**
	 * The hyperlink of the referenced object
	 */
	@JsonProperty("href")
	private String href;

	public String getRel()
	{
		return rel;
	}

	public void setRel(String rel)
	{
		this.rel = rel;
	}

	public String getHref()
	{
		return href;
	}

	public void setHref(String href)
	{
		this.href = href;
	}
}