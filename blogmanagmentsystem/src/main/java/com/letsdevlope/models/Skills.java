package com.letsdevlope.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Skill_id;
	private String Skill_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	
    @ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	/**
	 * @param skill_name
	 * @param created
	 * @param updated
	 * @param user
	 */
	public Skills(String skill_name, Date created, Date updated, User user) {
		Skill_name = skill_name;
		this.created = created;
		this.updated = updated;
		this.user = user;
	}

	public Skills() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSkill_id() {
		return Skill_id;
	}

	public String getSkill_name() {
		return Skill_name;
	}

	public Date getCreated() {
		return created;
	}

	public Date getUpdated() {
		return updated;
	}

	public User getUser() {
		return user;
	}

	public void setSkill_name(String skill_name) {
		Skill_name = skill_name;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
