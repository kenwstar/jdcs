package com.qishon.jdcs.entity.stm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.qishon.common.entity.BaseEntity;

/**
 * 角色管理
 * 
 * @author Kenny
 */
@Entity
@Table(name = "STM_ROLE")
public class StmRole extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stmRoleKey; // 主键
	private String stmRoleName; // 角色名称

	@Id
	@TableGenerator(name = "tab_stone", table = "generator_table", pkColumnName = "g_key", valueColumnName = "g_value", pkColumnValue = "role_pk", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tab_stone")
	@Column(name = "ROLEKEY", nullable = false, length = 8)
	public Integer getStmRoleKey() {
		return stmRoleKey;
	}

	public void setStmRoleKey(Integer stmRoleKey) {
		this.stmRoleKey = stmRoleKey;
	}

	@Column(name = "ROLENAME", nullable = false, length = 30)
	public String getStmRoleName() {
		return stmRoleName;
	}

	public void setStmRoleName(String stmRoleName) {
		this.stmRoleName = stmRoleName;
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
