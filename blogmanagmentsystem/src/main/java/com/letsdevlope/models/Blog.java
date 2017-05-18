package com.letsdevlope.models;

import java.sql.Clob;
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
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Blog_id;
	private long Author_id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Author author;
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	private String Tags;
	private String programing_Language;
	private String title;
	private Clob  content;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	private Boolean isDeleted;
	private Integer Ststus;
	public Long getBlog_id() {
		return Blog_id;
	}
	public long getAuthor_id() {
		return Author_id;
	}
	public String getTags() {
		return Tags;
	}
	public String getPrograming_Language() {
		return programing_Language;
	}
	public String getTitle() {
		return title;
	}
	public Clob getContent() {
		return content;
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
	public Integer getStstus() {
		return Ststus;
	}
	public void setAuthor_id(long author_id) {
		Author_id = author_id;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	public void setPrograming_Language(String programing_Language) {
		this.programing_Language = programing_Language;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(Clob content) {
		this.content = content;
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
	public void setStstus(Integer ststus) {
		Ststus = ststus;
	}
	/**
	 * 
	 */
	public Blog() {
	}
	/**
	 * @param author_id
	 * @param author
	 * @param tags
	 * @param programing_Language
	 * @param title
	 * @param content
	 * @param created
	 * @param updated
	 * @param isDeleted
	 * @param ststus
	 */
	public Blog(long author_id, Author author, String tags, String programing_Language, String title, Clob content,
			Date created, Date updated, Boolean isDeleted, Integer ststus) {
		Author_id = author_id;
		this.author = author;
		Tags = tags;
		this.programing_Language = programing_Language;
		this.title = title;
		this.content = content;
		this.created = created;
		this.updated = updated;
		this.isDeleted = isDeleted;
		Ststus = ststus;
	}


}
