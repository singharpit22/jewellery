package com.rbpd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

@MappedSuperclass
public class AuditAwareEntity implements BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	@PrePersist
	public void setCreatedDate() {
		this.createdDate = new Date();
	}
	
	@PostPersist
	public void setModifiedDate() {
		this.modifiedDate = new Date();
	}
	

}
