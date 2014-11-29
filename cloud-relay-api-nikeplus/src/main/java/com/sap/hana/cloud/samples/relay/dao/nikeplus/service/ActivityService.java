package com.sap.hana.cloud.samples.relay.dao.nikeplus.service;

import org.codegist.crest.annotate.Consumes;
import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.Path;
import org.codegist.crest.annotate.PathParam;
import org.codegist.crest.annotate.QueryParam;

import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.Activities;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.Activity;


@EndPoint("https://api.nike.com")
@Path("/v1/me/sport/activities")
@Consumes("application/json")
public interface ActivityService
{
	/**
	 * <p>The <code>/v1/me/sport/activities</code> endpoint provides summary details of the user's activities, 
	 * beginning with the most recent activity, as a paginated list. Activity summaries include the type of activity, 
	 * its time-stamp and duration, total calories burned, total NikeFuel earned, and the device type on which 
	 * the activity was recorded.</p>
     *
	 * <p><b>Note</b>: This endpoint does not return metric detail data, 
	 * which can only be retrieved for one activity at a time by calling the <code>/v1/me/sport/activities/{activityId}</code> endpoint. 
	 * This endpoint also does not return GPS data, which can only be retrieved for one activity at a time by calling the 
	 * <code>/v1/me/sport/activities/{activityId}/gps</code> endpoint.</p>
	 * 
	 * <p>Sample Request:</p>
	 * <pre><code>GET https://api.nike.com/v1/me/sport/activities?access_token={access_token}&count=10&startDate=2012-01-01&endDate=2014-02-15</code></pre>
	 * 
	 * @param accessToken User's access token (required)
	 * @param count Pagination - number of records to retrieve (default 5)
	 * @param offset Pagination - first record to retrieve (starts at 1)
	 * @param startDate The Activity list's start date in ISO8601 standard format, 'yyyy-mm-dd'. When endDate is used, then startDate is required.
	 * @param endDate The Activity list's end date in ISO8601 standard format, 'yyyy-mm-dd'. When startDate is used, then endDate is required.
	 * @return Summary details of the user's activities
	 * 
	 * @see https://developer.nike.com/documentation/api-docs/activity-services/list-activities.html
	 */
    Activities listActivities(@QueryParam("access_token") String accessToken,
    						  @QueryParam("count") Integer count,
    						  @QueryParam("offset") Integer offset,
    						  @QueryParam("startDate") String startDate,
    						  @QueryParam("endDate") String endDate);
    
    
    /**
     * <p> The <code>/v1/me/sport/activities/{activityId}</code>  endpoint provides details of the user's activities, 
     * specified by its Activity ID. Activity details include the type of activity, its time stamp and duration, 
     * calories burned, NikeFuel earned, and the type of device that recorded the activity.<p>
     *
	 * <p>For example, retrieving the details on a specific activity from a FuelBand gives all the data necessary 
	 * to visualize an athlete's day. The data returned is recorded in minute intervals for NikeFuel, calories and steps. 
	 * It can then be transformed to suit the application's needs. Additionally, the endpoint grants access to information about 
	 * the data of the activity and the user's time zone.</p>
	 *
	 * <p><b>Note</b>: this endpoint does not return GPS data, which can only be retrieved one activity at a time by calling 
	 * the <code>/v1/me/sport/activities/{activityId}/gps</code> endpoint.</p>
	 * 
	 * <p>Sample Request:</p>
	 * <pre><code>GET https://api.nike.com/v1/me/sport/activities/{activityId}</code></pre>
     * 
     * @param id The ID path parameter in the endpoint URL is the sport activity unique identifier for the desired Activity
     * @param accessToken User's access token (required)
     * @return
     * 
     * @see https://developer.nike.com/documentation/api-docs/activity-services/activity-detail.html
     */
    @Path("/{activityId}")
    Activity getActivityDetail(@PathParam("activityId") String id, @QueryParam("access_token") String accessToken);
    
    
    
    
}
