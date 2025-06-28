package com.entity;

public class Student {

	private int stud_id;
	private String name;
	private int age;
	private String city;
	private College college;

	public Student() {
		super();

	}

	public Student(int stud_id, String name, int age, String city, College college) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.college = college;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", age=" + age + ", city=" + city + ", college="
				+ college + "]";
	}

}
