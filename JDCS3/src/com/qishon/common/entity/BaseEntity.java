package com.qishon.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date crtLog;
	private Date amdLog;

	@Column(name = "CRTLOG", nullable = false)
	public Date getCrtLog() {
		if (crtLog == null) {
			crtLog = new Date();
		}
		return crtLog;
	}

	public void setCrtLog(Date crtLog) {
		if (crtLog == null) {
			crtLog = new Date();
		}
		this.crtLog = crtLog;
	}

	@Column(name = "AMDLOG", nullable = false)
	public Date getAmdLog() {
		if (amdLog == null) {
			amdLog = new Date();
		}
		return amdLog;
	}

	public void setAmdLog(Date amdLog) {
		if (amdLog == null) {
			amdLog = new Date();
		}
		this.amdLog = amdLog;
	}
}
