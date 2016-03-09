package com.qishon.jdcs.action.stm;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.qishon.common.action.StrutsAction;
import com.qishon.jdcs.entity.stm.StmRole;
import com.qishon.jdcs.entity.stm.StmUser;
import com.qishon.jdcs.service.stm.StmRoleServiceImp;
import com.qishon.jdcs.service.stm.StmUserServiceImp;

/**
 * 人员管理
 * 
 * @author Kenny
 */
@Results({ @Result(name = StrutsAction.RELOAD, location = StmuserAction.STM_USER_ACTION, type = StrutsAction.REDIRECT),
		@Result(name = StrutsAction.JSON, type = StrutsAction.JSON, params = { "root", "result" }) })
public class StmuserAction extends StrutsAction<StmUser> implements IStmuserAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String STM_USER_ACTION = "stmuser.action";
	private Integer stmRoleKey;
	private String stmUserName;

	@Autowired
	private StmUserServiceImp stmUserServiceImp;
	@Autowired
	private StmRoleServiceImp stmRoleServiceImp;

	/**
	 * 覆盖数据集显示回调函数
	 */
	@Override
	protected void doListEntity() throws Exception {
		list = stmUserServiceImp.queryResult(getRequest());
	}

	public List<StmRole> getAllRoles() {
		return stmRoleServiceImp.getStmRoles();
	}

	public Integer getStmRoleKey() {
		return stmRoleKey;
	}

	public void setStmRoleKey(Integer stmRoleKey) {
		this.stmRoleKey = stmRoleKey;
	}

	public String getStmUserName() {
		return stmUserName;
	}

	public void setStmUserName(String stmUserName) {
		this.stmUserName = stmUserName;
	}

}
