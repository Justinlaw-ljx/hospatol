package com.model;

/**
 * TUser generated by MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable
{

	// Fields

	private Integer userId;

	private String userName;

	private String userPw;

	private Integer userType;
	
	private String userRealname;

	private String userTel;
	
	private String userEmail;
	
	private String userOne2;

	private Integer userOne3;

	private Integer userOne4;

	// Constructors

	/** default constructor */
	public TUser()
	{
	}

	/** full constructor */
	public TUser(String userName, String userPw, Integer userType,
			String userOne2, Integer userOne3, Integer userOne4)
	{
		this.userName = userName;
		this.userPw = userPw;
		this.userType = userType;
		this.userOne2 = userOne2;
		this.userOne3 = userOne3;
		this.userOne4 = userOne4;
	}

	// Property accessors

	public Integer getUserId()
	{
		return this.userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}


	public String getUserRealname()
	{
		return userRealname;
	}

	public void setUserRealname(String userRealname)
	{
		this.userRealname = userRealname;
	}


	public String getUserEmail()
	{
		return userEmail;
	}

	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

	public String getUserTel()
	{
		return userTel;
	}

	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}

	public String getUserPw()
	{
		return this.userPw;
	}

	public void setUserPw(String userPw)
	{
		this.userPw = userPw;
	}

	public Integer getUserType()
	{
		return this.userType;
	}

	public void setUserType(Integer userType)
	{
		this.userType = userType;
	}

	public String getUserOne2()
	{
		return this.userOne2;
	}

	public void setUserOne2(String userOne2)
	{
		this.userOne2 = userOne2;
	}

	public Integer getUserOne3()
	{
		return this.userOne3;
	}

	public void setUserOne3(Integer userOne3)
	{
		this.userOne3 = userOne3;
	}

	public Integer getUserOne4()
	{
		return this.userOne4;
	}

	public void setUserOne4(Integer userOne4)
	{
		this.userOne4 = userOne4;
	}

}