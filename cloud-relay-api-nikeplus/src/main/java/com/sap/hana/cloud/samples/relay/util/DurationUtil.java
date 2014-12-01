package com.sap.hana.cloud.samples.relay.util;

import java.util.concurrent.TimeUnit;


public class DurationUtil
{
	/**
	 * 
	 * 
	 * <p><b>Example:</b>
	 * <pre><code>1:32:29.489</code></pre>
	 * </p>
	 * 
	 * @param format
	 * @return
	 */
	public static long parseDuration(String format)
	{
		long retVal = 0;
		
		// TODO validate proper formatting
		
		String str = format;
		
		// first get milliseconds
		int index = format.lastIndexOf(".");
		int ms = Integer.parseInt(str.substring(index +1));
		
		// strip off milliseconds
		str = str.substring(0, index);
		
		String[] token = str.split(":");
		
		int h = Integer.parseInt(token[0]);
		int m = Integer.parseInt(token[1]);
		int s = Integer.parseInt(token[2]);
		
		retVal += TimeUnit.MILLISECONDS.convert(h, TimeUnit.HOURS);
		retVal += TimeUnit.MILLISECONDS.convert(m, TimeUnit.MINUTES);
		retVal += TimeUnit.MILLISECONDS.convert(s, TimeUnit.SECONDS);
		retVal += TimeUnit.MILLISECONDS.convert(ms,TimeUnit.MILLISECONDS);
		
		return retVal;
	}
}
