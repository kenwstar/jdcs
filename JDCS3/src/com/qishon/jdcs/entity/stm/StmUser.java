package com.qishon.jdcs.entity.stm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.qishon.common.entity.BaseEntity;

/**
 * 人员管理
 * 
 * @author Kenny
 */
@Entity
@Table(name = "STM_USER")
public class StmUser extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stmUserKey; // 主键
	private String stmUserName; // 登录用户
	private StmRole stmRole; // 角色ID

	@Id
	@TableGenerator(name = "tab_stone", table = "generator_table", pkColumnName = "g_key", valueColumnName = "g_value", pkColumnValue = "user_pk", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tab_stone")
	@Column(name = "USERKEY", nullable = false, length = 8)
	public Integer getStmUserKey() {
		return stmUserKey;
	}

	public void setStmUserKey(Integer stmUserKey) {
		this.stmUserKey = stmUserKey;
	}

	@Column(name = "USERNAME", nullable = false, length = 30)
	public String getStmUserName() {
		return stmUserName;
	}

	public void setStmUserName(String stmUserName) {
		this.stmUserName = stmUserName;
	}

	@ManyToOne()
	// (fetch = FetchType.EAGER)
	@JoinColumn(name = "ROLEKEY")
	public StmRole getStmRole() {
		return stmRole;
	}

	public void setStmRole(StmRole stmRole) {
		this.stmRole = stmRole;
	}

	@Column(name = "CRTLOG", nullable = false)
	public Date getCrtLog() {
		return super.getCrtLog();
	}

	public void setCrtLog(Date crtLog) {
		super.setCrtLog(crtLog);
	}

	@Column(name = "AMDLOG", nullable = false)
	public Date getAmdLog() {
		return super.getAmdLog();
	}

	public void setAmdLog(Date amdLog) {
		super.setAmdLog(amdLog);
	}
}
