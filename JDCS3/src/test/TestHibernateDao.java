package test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qishon.jdcs.entity.stm.StmRole;
import com.qishon.jdcs.entity.stm.StmUser;
import com.qishon.jdcs.service.stm.StmRoleServiceImp;
import com.qishon.jdcs.service.stm.StmUserServiceImp;

public class TestHibernateDao {

	private static StmUserServiceImp userManager;
	private static StmRoleServiceImp roleManager;
	
	@BeforeClass
	public static void init(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		userManager = (StmUserServiceImp)context.getBean("userManager");
		roleManager = (StmRoleServiceImp)context.getBean("roleManager");
	}
	
	@Test
	public void testUser(){
		StmUser user = userManager.getStmUser(1);
		Assert.assertEquals("张三",user.getStmUserName());
		System.out.println("ID： "+user.getStmUserKey()+" 姓名： "+user.getStmUserName());
	}
	
	@Test
	public void testRole(){
		StmRole role = roleManager.getStmRole(1);
		Assert.assertEquals("超级管理员2",role.getStmRoleName());
		System.out.println("ID： "+role.getStmRoleKey()+" 角色名： "+role.getStmRoleName());
	}
}
