package com.letsdevlope.models;
// Generated May 19, 2017 3:42:08 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Skill generated by hbm2java
 */
@Entity
@Table(name = "skill", catalog = "mydb")
public class Skill implements java.io.Serializable {

	private SkillId id;
	private User user;
	private String skillName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date skillCreated;
	@Temporal(TemporalType.TIMESTAMP)
	private Date skillUpdated;

	public Skill() {
	}

	public Skill(SkillId id, User user) {
		this.id = id;
		this.user = user;
	}

	public Skill(SkillId id, User user, String skillName, Date skillCreated, Date skillUpdated) {
		this.id = id;
		this.user = user;
		this.skillName = skillName;
		this.skillCreated = skillCreated;
		this.skillUpdated = skillUpdated;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "skillId", column = @Column(name = "SKILL_ID", nullable = false)),
			@AttributeOverride(name = "userUserId", column = @Column(name = "USER_USER_ID", nullable = false)) })
	public SkillId getId() {
		return this.id;
	}

	public void setId(SkillId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_USER_ID", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "SKILL_NAME", length = 45)
	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SKILL_CREATED", length = 19)
	public Date getSkillCreated() {
		return this.skillCreated;
	}

	public void setSkillCreated(Date skillCreated) {
		this.skillCreated = skillCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SKILL_UPDATED", length = 19)
	public Date getSkillUpdated() {
		return this.skillUpdated;
	}

	public void setSkillUpdated(Date skillUpdated) {
		this.skillUpdated = skillUpdated;
	}

}
