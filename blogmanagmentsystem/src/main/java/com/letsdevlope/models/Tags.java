package com.letsdevlope.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tags {
 @Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer tag_id;
private String tag_name;
@Temporal(TemporalType.TIMESTAMP)
private Date created;
 @Column
 @Temporal(TemporalType.TIMESTAMP)
 private Date updated;
public Integer getTag_id() {
	return tag_id;
}
public String getTag_name() {
	return tag_name;
}
public Date getCreated() {
	return created;
}
public Date getUpdated() {
	return updated;
}
public void setTag_name(String tag_name) {
	this.tag_name = tag_name;
}
public void setCreated(Date created) {
	this.created = created;
}
public void setUpdated(Date updated) {
	this.updated = updated;
}
/**
 * @param tag_name
 * @param created
 * @param updated
 */
public Tags(String tag_name, Date created, Date updated) {
	this.tag_name = tag_name;
	this.created = created;
	this.updated = updated;
}
/**
 * 
 */
public Tags()
{
}
 

}
