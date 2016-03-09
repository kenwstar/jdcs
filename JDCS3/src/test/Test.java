package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qishon.jdcs.entity.stm.StmRole;
import com.qishon.jdcs.entity.stm.StmUser;
import com.qishon.jdcs.service.stm.StmRoleServiceImp;
import com.qishon.jdcs.service.stm.StmUserServiceImp;

/**
 * 测试
 * @author Kenny
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StmUserServiceImp userManager = (StmUserServiceImp)context.getBean("stmUserServiceImp");
		StmRoleServiceImp roleManager = (StmRoleServiceImp)context.getBean("stmRoleServiceImp");
		StmUser user = userManager.getStmUser(10001);
		System.out.println("ID： "+user.getStmUserKey()+" 姓名： "+user.getStmUserName());
		StmRole role = roleManager.getStmRole(10640);
		System.out.println("ID： "+role.getStmRoleKey()+" 角色名： "+role.getStmRoleName());
	}
}
