package com.qishon.jdcs.dao.stm;

import org.springframework.stereotype.Repository;

import com.qishon.common.dao.HibernateDaoImp;
import com.qishon.jdcs.entity.stm.StmUser;

/**
 * 人员管理
 * 
 * @author Kenny
 */ 
@Repository
public class StmUserDaoImp extends HibernateDaoImp<StmUser> implements IStmUserDao{

}