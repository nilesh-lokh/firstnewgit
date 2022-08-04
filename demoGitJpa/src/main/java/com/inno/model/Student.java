package com.inno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STUDENT_ID")
	private int sroll;
	@Column(name="STUDENT_NAME")
	private String sname;
	@Column(name="STUDENT_EMAIL")
	private String semail;
	@Column(name="STUDENT_AGE")
	private int age;
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sroll=" + sroll + ", sname=" + sname + ", semail=" + semail + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
