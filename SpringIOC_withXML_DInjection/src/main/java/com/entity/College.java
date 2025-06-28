package com.entity;

public class College {

	private int c_id;
	private String clg_name;

	public College() {
		super();
	}

	public College(int c_id, String clg_name) {
		super();
		this.c_id = c_id;
		this.clg_name = clg_name;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", clg_name=" + clg_name + "]";
	}

}
