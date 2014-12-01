package com.sap.hana.cloud.samples.relay.dao.nikeplus.service;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.Activity;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.ActivityGPSData;
import com.sap.hana.cloud.samples.relay.dao.nikeplus.model.WayPoint;
import com.sap.hana.cloud.samples.relay.model.GPXData;
import com.sap.hana.cloud.samples.relay.model.GPXMetaData;
import com.sap.hana.cloud.samples.relay.model.GPXMetaData.Author;
import com.sap.hana.cloud.samples.relay.model.GPXTrack;
import com.sap.hana.cloud.samples.relay.model.GPXTrackPoint;
import com.sap.hana.cloud.samples.relay.util.DurationUtil;

public class GPXWriter
{
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); 
	
	public static GPXData convertActivity(Activity activity, ActivityGPSData gpsData)
	{
		GPXData retVal = new GPXData();
		
		try
		{
			/*
			 * meta data
			 */
			GPXMetaData metaData = new GPXMetaData();
			
			Author author = new Author();
			//author.setName();
			
			String name = MessageFormat.format("{0} ON: {1}", activity.getType(), dateFormat.format(activity.getStartTime()));
			
			metaData.setAuthor(author);
			metaData.setName(name);
			metaData.setTime(activity.getStartTime());
			metaData.setDescription(name);
			
			retVal.setMetaData(metaData);
			
			/*
			 * track
			 */
			
			GPXTrack track = new GPXTrack();
			
			String durationStr = activity.getMetricSummary().getDuration();
			long duration = DurationUtil.parseDuration(durationStr);
			
			int noOfWayPoints = gpsData.getWaypoints().length;
			GPXTrackPoint[] trackPoint = new GPXTrackPoint[noOfWayPoints];
			
			Double split = duration / ((noOfWayPoints - 1) * 1.000); // split time [ms]
			
			int i = 0;
			long timeinMicroSeconds = activity.getStartTime().getTime() * 1000;
			
			for (WayPoint wayPoint : gpsData.getWaypoints())
			{
				GPXTrackPoint point = new GPXTrackPoint();
				
				point.setLatitude(wayPoint.getLatitude().toString());
				point.setLongitute(wayPoint.getLongitude().toString());
				point.setElevation(wayPoint.getElevation().toString());
				
				Date time = new Date(Math.round(timeinMicroSeconds/1000.000));
				point.setTime(time);
				
				// increment time with split time
				long splitMicroSecS = Math.round(split * 1000);
				timeinMicroSeconds += splitMicroSecS;
				
				trackPoint[i] = point;
				i++;
			}
			
			track.setTrackPoint(trackPoint);
			
			retVal.setTrack(track);
			
		
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		return retVal;
	}
}
