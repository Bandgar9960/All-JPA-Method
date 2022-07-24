package com.BandgarIt.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID")
	private int sid;

	@Column(name = "STUDENT_NAME")
	private String name;

	@Column(name = "STUDENT_ADDRESS")
	private String address;

	@Column(name = "STUDENT_EMAIL")
	private String email;

	@Column(name = "STUDENT_AGE")
	private int age;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age
				+ "]";
	}

}
