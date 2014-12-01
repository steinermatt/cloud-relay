package com.sap.hana.cloud.samples.relay.model;

import org.simpleframework.xml.ElementArray;

public class GPXTrack
{	
	
	@ElementArray(name="trkseg", entry="trkpt", required=false)
	private GPXTrackPoint[] trackPoint;

	public GPXTrackPoint[] getTrackPoint()
	{
		return trackPoint;
	}

	public void setTrackPoint(GPXTrackPoint[] trackPoint)
	{
		this.trackPoint = trackPoint;
	}
	
	
}
