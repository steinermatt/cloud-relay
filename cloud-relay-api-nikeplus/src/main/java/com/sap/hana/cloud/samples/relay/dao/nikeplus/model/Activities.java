package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

import com.sap.hana.cloud.samples.relay.dao.nikeplus.service.ActivityService;

/**
 * Object returned by {@link ActivityService#listActivities(String, Integer, Integer, String, String)}.
 * 
 * @see ActivityService#listActivities(String, Integer, Integer, String, String)
 * @see https://api.nike.com/v1/schemas/Activities.json
 */
public class Activities implements Serializable
{
	/**
	 * The {@link #serialVersionUID} of this object
	 */
    private static final long serialVersionUID = 1L;
    
    /**
     * Array of {@link Activity} objects
     */
    @JsonProperty("data")
    private Activity[] activities;

	public Activity[] getActivities()
	{
		return activities;
	}

	public void setActivities(Activity[] activities)
	{
		this.activities = activities;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("data", activities)
                .toString();
    }

}
