package com.sap.hana.cloud.samples.relay.model;

import java.util.Date;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

public class GPXMetaData
{
	@Element
	String name = null; // "RUN ON: 11/25/14 11:22 AM";

	@Element(required=false)
	Author author = null;

	@Element
	Date time = null;

	@Element(name = "desc")
	String description = null; // "RUN ON: 11/25/14 11:22 AM #nike+";

	// bounds

	@Root(name = "author")
	public static class Author
	{
		@Element(required=false)
		String name = null;

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Author getAuthor()
	{
		return author;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
