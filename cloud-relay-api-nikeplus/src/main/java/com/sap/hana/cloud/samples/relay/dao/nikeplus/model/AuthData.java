package com.sap.hana.cloud.samples.relay.dao.nikeplus.model;

import java.io.Serializable;

import org.codegist.common.lang.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;


public class AuthData implements Serializable
{
	/**
	 *  The {@link #serialVersionUID} of this object
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("access_token")
	private String accessToken;
	
	@JsonProperty("expires_in")
	private String expiresIn;
	
	@JsonProperty("profile_img_url")
	private String ProfileImgUrl;
	
	@JsonProperty("token_type")
	private String tokenType;

	public String getAccessToken()
	{
		return accessToken;
	}

	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

	public String getExpiresIn()
	{
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn)
	{
		this.expiresIn = expiresIn;
	}

	public String getProfileImgUrl()
	{
		return ProfileImgUrl;
	}

	public void setProfileImgUrl(String profileImgUrl)
	{
		ProfileImgUrl = profileImgUrl;
	}

	public String getTokenType()
	{
		return tokenType;
	}

	public void setTokenType(String tokenType)
	{
		this.tokenType = tokenType;
	}
	
	public String toString() 
	{
        return new ToStringBuilder(this)
                .append("accessToken", accessToken)
                .toString();
    }
}