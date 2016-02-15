package com.hibernate;

import java.io.Serializable;
//import javax.persistance.*;

//@Entity
//@Table(name="STUDENT_DETAILS")

public class Student implements Serializable {
	
//	@Id
//	@GeneratedValue(stategy = Generationtype.IDENTITY)
//	@Column(name = "ID", nullable = false, unique = true, length = 15)
	private int id;

//	@Column(name = "LAST_NAME", nullable = false, length = 20)
	private String lastName;

//	@Column(name = "FIRST_NAME", nullable = false, length = 20)
	private String firstName;

//	@Column(name = "PHONE_NO", nullable = false, length = 10)
	private String phoneNo;

	/*public Student(String lastName,String firstName,String phoneNo){
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNo = phoneNo;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhoneNO() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
		
}








