package com.lssf.app;

public class Student {
	private String sno;
	private String sname;
	private String ssex;
	private String sbrithday;
	private String sclass;
	public Student(String sno, String sname, String ssex, String sbrithday, String sclass) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sbrithday = sbrithday;
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", ssex=" + ssex + ", sbrithday=" + sbrithday + ", sclass="
				+ sclass + "]";
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSbrithday() {
		return sbrithday;
	}
	public void setSbrithday(String sbrithday) {
		this.sbrithday = sbrithday;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

}
