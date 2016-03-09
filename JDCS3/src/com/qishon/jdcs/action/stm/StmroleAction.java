package com.qishon.jdcs.action.stm;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.qishon.common.action.StrutsAction;
import com.qishon.jdcs.entity.stm.StmRole;

/**
 * 角色管理
 * 
 * @author Kenny
 */
@Results({ @Result(name = StmroleAction.REDIRECT_STM_USER, location = StmuserAction.STM_USER_ACTION, type = StrutsAction.REDIRECT_ACTION),
		@Result(name = StrutsAction.RELOAD, location = StmroleAction.STM_ROLE_ACTION, type = StrutsAction.REDIRECT),
		@Result(name = StrutsAction.JSON, type = StrutsAction.JSON, params = { "root", "result" })})
public class StmroleAction extends StrutsAction<StmRole> implements IStmroleAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String STM_ROLE_ACTION = "stmrole.action"; 
	public static final String REDIRECT_STM_USER = "redirectStmUser";

	/**
	 * 转到UserAction
	 */
	public String redirectStmUser() {
		return REDIRECT_STM_USER;
	}

}