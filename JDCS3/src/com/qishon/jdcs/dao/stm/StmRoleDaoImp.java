package com.qishon.jdcs.dao.stm;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Repository;

import com.qishon.common.dao.HibernateDaoImp;
import com.qishon.jdcs.entity.stm.StmRole;

/**
 * 角色管理
 * @author Kenny
 */
@Repository
public class StmRoleDaoImp extends HibernateDaoImp<StmRole> implements IStmRoleDao{

	@JSON(serialize=false)
	public List<StmRole> getStmRoles(){
		return super.getAll();
	}
}
