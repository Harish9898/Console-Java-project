package org.model.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class teacher {
private int teacherId;
private String tEmail;
private String firstName;
private String lastName;
private long phoneNumber;
private String address;
private String position;
@Id
@Column(name="TPOSITION",nullable=false)
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Id
@Column(name="TEACHERID",nullable=false)
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
@Column(name="TEACHEREMAIL",nullable=false,unique=true)
public String gettEmail() {
	return tEmail;
}

public void settEmail(String tEmail) {
	this.tEmail = tEmail;
}
@Id
@Column(name="TFIRSTNAME",nullable=false)
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Id
@Column(name="TLASTNAME",nullable=false)
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Id
@Column(name="TPHONENUMBER",nullable=false)
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Id
@Column(name="TADDRESS",nullable=false)
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public teacher(int teacherId, String tEmail, String firstName, String lastName, long phoneNumber, String address,
		String position) {
	super();
	this.teacherId = teacherId;
	this.tEmail = tEmail;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.position = position;
}

}
