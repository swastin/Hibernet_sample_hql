package com.letsdevlope.models;


import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.OneToMany;

@Entity
@Table
public class User {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private  Long id;
@Column
private String name;
@Column
private String email;
@Column
private String password;
@Column
private String gender;
@Column
private Date dateofbirth;
@Column
private long phonenumber;
@Column
@Temporal(TemporalType.TIMESTAMP)
private Date created;
@Column
@Temporal(TemporalType.TIMESTAMP)
private Date updated;
@OneToMany(cascade = CascadeType.ALL)
//private List <Skills> skill;
public Long getId() {
	return id;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public String getGender() {
	return gender;
}
public Date getDateofbirth() {
	return dateofbirth;
}
public long getPhonenumber() {
	return phonenumber;
}
public Date getCreated() {
	return created;
}
public Date getUpdated() {
	return updated;
}
/*public List<Skills> getSkill() {
	return skill;
}*/
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPassword(String password) {
	this.password = password;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public void setCreated(Date created) {
	this.created = created;
}
public void setUpdated(Date updated) {
	this.updated = updated;
}
/*public void setSkill(List<Skills> skill) {
	this.skill = skill;
}*/
/**
 * @param name
 * @param email
 * @param password
 * @param gender
 * @param dateofbirth
 * @param phonenumber
 * @param created
 * @param updated
 * @param skill
 */
public User(String name, String email, String password, String gender, Date dateofbirth, long phonenumber, Date created,
		Date updated) {
	this.name = name;
	this.email = email;
	this.password = password;
	this.gender = gender;
	this.dateofbirth = dateofbirth;
	this.phonenumber = phonenumber;
	this.created = created;
	this.updated = updated;

}
/**
 * 
 */
public User() {
}

}
