package user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.bean.UserBean;
import com.bwf.service.UserService;

@ContextConfiguration("classpath:spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void add() {
		UserBean user = new UserBean();
		user.setUname("博为峰");
		user.setBirthday("2001-09-09");
		System.out.println(userService.addUser(user));
	}
	
	

	@Test
	public void update() {
		UserBean user = new UserBean();
		user.setTid(80);
		user.setUname("博为峰");
		//user.setBirthday("2001-09-09");
		user.setMoney(9999d);
		System.out.println(userService.updateUser(user));
	}
	
	@Test
	public void delete() {
		UserBean user = new UserBean();
		user.setTid(80);
		System.out.println(userService.deleteUser(user));
	}
	

	@Test
	public void query() {
		UserBean user = new UserBean();
		// user.setUname("三");
		System.out.println(userService.queryUser(user));
	}
	
}
