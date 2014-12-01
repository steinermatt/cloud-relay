package com.sap.hana.cloud.samples.relay.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@NamespaceList({ @Namespace(reference = "http://www.topografix.com/GPX/1/1"),
                 @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
                 @Namespace(reference = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1", prefix = "gpxtpx"),
                 @Namespace(reference = "http://www.garmin.com/xmlschemas/GpxExtensions/v3", prefix = "gpxx") })
@Root(name = "gpx")
public class GPXData
{
	@Attribute
	String version = "1.0";
	
	@Attribute
	String creator = "Relay";

	@Element(name = "metadata")
	GPXMetaData metaData = null;

	@Element(name = "trk")
	GPXTrack track = null;

	public GPXMetaData getMetaData()
	{
		return metaData;
	}

	public void setMetaData(GPXMetaData metaData)
	{
		this.metaData = metaData;
	}

	public GPXTrack getTrack()
	{
		return track;
	}

	public void setTrack(GPXTrack track)
	{
		this.track = track;
	}
	
	

}
