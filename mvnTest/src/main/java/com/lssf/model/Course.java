package com.lssf.model;

public class Course {

	private String Cno;
	private String Tno;
	private String Cname;

	public Course(String cno, String tno, String cname) {
		super();
		Cno = cno;
		Tno = tno;
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Course [Cno=" + Cno + ", Tno=" + Tno + ", Cname=" + Cname + "]";
	}

	public String getCno() {
		return Cno;
	}

	public void setCno(String cno) {
		Cno = cno;
	}

	public String getTno() {
		return Tno;
	}

	public void setTno(String tno) {
		Tno = tno;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

}
