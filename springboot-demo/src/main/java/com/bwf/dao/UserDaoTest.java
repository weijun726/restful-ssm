package com.bwf.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.bean.UserBean;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTest {
	@Autowired private IUserDao userDao;
	
	@Test public void add() {
		UserBean user = new UserBean();
		user.setUname("博为峰");
		user.setMoney(9999d);
		user.setBirthday(new Date());
		
		user = userDao.save(user);
		System.out.println("--user:"+user);
	}
	
	@Test public void query() {
		List<UserBean> list = userDao.findAll();
		System.out.println("==list:"+list);
	}
	
	
}
