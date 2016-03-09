package com.qishon.jdcs.service.stm;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qishon.common.service.SpringServiceImp;
import com.qishon.jdcs.dao.stm.StmRoleDaoImp;
import com.qishon.jdcs.entity.stm.StmRole;

/**
 * 角色管理
 * 
 * @author Kenny
 */
@Service
public class StmRoleServiceImp extends SpringServiceImp<StmRole> implements IStmRoleService {

	@Autowired
	private StmRoleDaoImp stmRoleDao;

	/**
	 * 取得所有角色信息
	 */
	public List<StmRole> getStmRoles() {
		return stmRoleDao.getStmRoles();
	}

	public StmRole getStmRole(Serializable id) {
		StmRole stmRole = super.get(id);
		return stmRole;
	}
}
