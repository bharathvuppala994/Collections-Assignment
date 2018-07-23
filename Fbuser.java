package com.siri.facebook;

public class Fbuser implements Comparable<Fbuser> {
	private Integer FBID;
	private String FBemail;
	private String FBpassword;
	private String Fname;
	private String Lname;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private Integer Zip;
	private Integer Likecount;
	private Integer Sharecount;

	public Fbuser(Integer FBID, String FBemail, String FBpassword, String Fname, String Lname, String Address1, String Address2,
			String City, String State, Integer Zip, Integer Likecount, Integer Sharecount) {
		super();
		 this.FBID = FBID;
		 this.FBemail = FBemail;
		 this.FBpassword = FBpassword;
		this.Fname = Fname;
		this.Lname = Lname;
		this.Address1 = Address1;
		 this.Address2 = Address2;
		 this.City = City;
		this.State = State;
		 this.Zip = Zip;
		this.Likecount = Likecount;
		this.Sharecount = Sharecount;

	}

	
	public Fbuser() {
		super();
	}


	public Integer getFBID() {
		return FBID;
	}

	public void setFBID(Integer fBID) {
		FBID = fBID;
	}

	public String getFBemail() {
		return FBemail;
	}

	public void setFBemail(String fBemail) {
		FBemail = fBemail;
	}

	public String getFBpassword() {
		return FBpassword;
	}

	public void setFBpassword(String fBpassword) {
		FBpassword = fBpassword;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getZip() {
		return Zip;
	}

	public void setZip(Integer zip) {
		Zip = zip;
	}

	public Integer getLikecount() {
		return Likecount;
	}

	public void setLikecount(Integer likecount) {
		Likecount = likecount;
	}

	public Integer getSharecount() {
		return Sharecount;
	}

	public void setSharecount(Integer sharecount) {
		Sharecount = sharecount;
	}

	@Override
	public String toString() {
		return "Fbuser [FBID=" + FBID + ", FBemail=" + FBemail + ", FBpassword=" + FBpassword + ", Fname=" + Fname
				+ ", Lname=" + Lname + ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", Likecount=" + Likecount + ", Sharecount=" + Sharecount + "]";
	}

	@Override
	public int compareTo(Fbuser o) {
		if (this.getLikecount() > o.getLikecount()) {
			return -1;
		} else if (this.getLikecount() == o.getLikecount()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FBID == null) ? 0 : FBID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fbuser) {
			Fbuser FbObj = (Fbuser) obj;
			if (FbObj.getFBID() == this.getFBID()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
