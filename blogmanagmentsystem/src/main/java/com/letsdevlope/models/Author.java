package com.letsdevlope.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Long Author_id;
	
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
	private Integer experience;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	@ColumnDefault(value ="false")
	private Boolean isDeleted;
	@ColumnDefault(value ="false")
	private Boolean isVerified;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Blog>blogs=new ArrayList<>();
	public Long getAuthor_id() {
		return Author_id;
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
	public Integer getExperience() {
		return experience;
	}
	public Date getCreated() {
		return created;
	}
	public Date getUpdated() {
		return updated;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public Boolean getIsVerified() {
		return isVerified;
	}
	public List<Blog> getBlogs() {
		return blogs;
	}
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
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	/**
	 * @param name
	 * @param email
	 * @param password
	 * @param gender
	 * @param dateofbirth
	 * @param phonenumber
	 * @param experience
	 * @param created
	 * @param updated
	 * @param isDeleted
	 * @param isVerified
	 * @param blogs
	 */
	public Author(String name, String email, String password, String gender, Date dateofbirth, long phonenumber,
			Integer experience, Date created, Date updated, Boolean isDeleted, Boolean isVerified, List<Blog> blogs) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.phonenumber = phonenumber;
		this.experience = experience;
		this.created = created;
		this.updated = updated;
		this.isDeleted = isDeleted;
		this.isVerified = isVerified;
		this.blogs = blogs;
	}
	/**
	 * 
	 */
	public Author() {
	}


}
