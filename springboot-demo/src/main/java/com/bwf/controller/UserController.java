package com.bwf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bwf.bean.UserBean;
import com.bwf.dao.IUserDao;

/**
 * 控制层包
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired private IUserDao userDao;
	
//	@RequestMapping("/queryAll")
//	public List<UserBean>  queryAll() {
//		List<UserBean> list = userDao.findAll();
//		return list;
//	}
	

	/**
	 * 进去queryUser.jsp界面
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage() {
		return "/user/addUser";
	}
	
	/**
	 * 新增业务实现
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(UserBean user,HttpServletRequest request) {
		userDao.save(user);
		request.setAttribute("msg", "新增成功");
		return "/user/addUser";
	}
	
	
	/**
	 * 进去queryUser.jsp界面
	 */
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String queryAll(HttpServletRequest request) {
		List<UserBean> list = userDao.findAll();
		request.setAttribute("userList", list);
		return "/user/queryUser";	  //页面转发到/WEB-INF/webview/user/queryUser.jsp	
	}
	
}
