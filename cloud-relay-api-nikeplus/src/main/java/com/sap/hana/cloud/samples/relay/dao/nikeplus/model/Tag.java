package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Extra details the user entered about the Activity
 * 
 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
 */
public class Tag implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Type of tag
	 */
	@JsonProperty("tagType")
	private String tagType;

	/**
	 * The value or detail of the tag
	 */
	@JsonProperty("tagValue")
	private String tagValue;

	public String getTagType()
	{
		return tagType;
	}

	public void setTagType(String tagType)
	{
		this.tagType = tagType;
	}

	public String getTagValue()
	{
		return tagValue;
	}

	public void setTagValue(String tagValue)
	{
		this.tagValue = tagValue;
	}

	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("type", tagType)
                .append("value", tagValue)
                .toString();
    }
	
}