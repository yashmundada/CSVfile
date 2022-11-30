package com.mobiloitte.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Csvmodel {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String issue;
	private String issueid;
	private String age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getIssueid() {
		return issueid;
	}
	public void setIssueid(String issueid) {
		this.issueid = issueid;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Csvmodel [id=" + id + ", name=" + name + ", issue=" + issue + ", issueid=" + issueid + ", age=" + age
				+ "]";
	}
	
	
	

}

