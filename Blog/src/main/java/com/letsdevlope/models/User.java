package com.letsdevlope.models;
// Generated May 19, 2017 3:42:08 PM by Hibernate Tools 5.2.1.Final

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "mydb")
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userGender;
	private Date userDateofbirth;
	private String userPhonenumber;
	

	private Date userCreated;
	private Date userUpdated;
	private Byte userIsdeleted;
	private String userRole;
	private Set<Skill> skills = new HashSet<Skill>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);

	public User() {
	}

	public User(String userName, String userEmail, String userPassword, String userGender, Date userDateofbirth,
			String userPhonenumber, Date userCreated, Date userUpdated, Byte userIsdeleted, String userRole,
			Set<Skill> skills, Set<Comment> comments) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userDateofbirth = userDateofbirth;
		this.userPhonenumber = userPhonenumber;
		this.userCreated = userCreated;
		this.userUpdated = userUpdated;
		this.userIsdeleted = userIsdeleted;
		this.userRole = userRole;
		this.skills = skills;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	@Column(unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(length = 8)
	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Temporal(TemporalType.DATE)
	@Column(length = 10)
	public Date getUserDateofbirth() {
		return this.userDateofbirth;
	}

	public void setUserDateofbirth(Date userDateofbirth) {
		this.userDateofbirth = userDateofbirth;
	}

	@Column
	public String getUserPhonenumber() {
		return this.userPhonenumber;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "USER_CREATED", length = 19)
	public Date getUserCreated() {
		return this.userCreated;
	}

	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(length = 19)
	public Date getUserUpdated() {
		return this.userUpdated;
	}

	public void setUserUpdated(Date userUpdated) {
		this.userUpdated = userUpdated;
	}

	@Column
	public Byte getUserIsdeleted() {
		return this.userIsdeleted;
	}

	public void setUserIsdeleted(Byte userIsdeleted) {
		this.userIsdeleted = userIsdeleted;
	}

	@Column
	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public void setUserPhonenumber(String userPhonenumber) {
		this.userPhonenumber = userPhonenumber;
	}

}
