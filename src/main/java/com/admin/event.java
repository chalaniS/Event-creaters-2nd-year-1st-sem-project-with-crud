package com.admin;

public class event {
	
	private int eid;
	private String ename;
	private String edate;
	private String etype;
	private String elocation;
	private String etime;
	
	public event(int eid, String ename, String edate, String etype, String elocation, String etime) {
		this.eid = eid;
		this.ename = ename;
		this.edate = edate;
		this.etype = etype;
		this.elocation = elocation;
		this.etime = etime;
	}	

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEdate() {
		return edate;
	}

	public String getEtype() {
		return etype;
	}

	public String getElocation() {
		return elocation;
	}

	public String getEtime() {
		return etime;
	}
	
}
