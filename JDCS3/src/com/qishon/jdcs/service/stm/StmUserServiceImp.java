package com.qishon.jdcs.service.stm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qishon.common.service.SpringServiceImp;
import com.qishon.jdcs.dao.stm.StmUserDaoImp;
import com.qishon.jdcs.entity.stm.StmUser;

/**
 * 人员管理
 * 
 * @author Kenny
 */
@Service
public class StmUserServiceImp extends SpringServiceImp<StmUser> implements
		IStmUserService {

	@Autowired
	private StmUserDaoImp stmUserDaoImp;

	/**
	 * 根据条件查询
	 */
	public List<StmUser> queryResult(HttpServletRequest request) {
		List<Criterion> criterions = new ArrayList<Criterion>();
		String userName = request.getParameter("stmUserName");
		if (StringUtils.isNotBlank(userName))
			criterions.add(Restrictions.like("stmUserName", userName,
					MatchMode.ANYWHERE));
		String stmRoleKey = request.getParameter("stmRoleKey");
		if (StringUtils.isNotBlank(stmRoleKey))
			criterions.add(Restrictions.eq("stmRole.stmRoleKey",
					Integer.valueOf(stmRoleKey)));
		return stmUserDaoImp.query(criterions.toArray(new Criterion[criterions
				.size()]));
	}

	public StmUser getStmUser(Serializable id) {
		StmUser stmUser = super.get(id);
		return stmUser;
	}
}
