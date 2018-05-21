package com.bwf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bwf.bean.UserBean;
import com.bwf.exception.BWFException;
import com.bwf.service.UserService;

/**
 * 控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired private UserService userService;
	
	/**
	 * 查询方法
	 * @return
	 */
	@RequestMapping(value="",method=RequestMethod.GET)
	public String queryUser(UserBean user,HttpServletRequest request) {
		List list = userService.queryUser(user);
		request.setAttribute("userList", list);
		return "/queryUser.jsp";
	}
	
	/**
	 * 新增数据
	 * @param user
	 * @return
	 */
	@RequestMapping(value="",method=RequestMethod.POST)
	public ResponseEntity<UserBean> addUser(@RequestBody UserBean user){
		try {
			boolean flag = userService.addUser(user);
			if(flag) {
				user.setSuccess(true);
				user.setMessage("新增数据成功..");
			}
		} catch (BWFException e) {
			e.printStackTrace();
			user.setSuccess(false);
			user.setMessage("新增数据失败.");
		}
		return ResponseEntity.ok(user);  //返回json格式的字符
	}
	
	/**
	 * 删除数据
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/{tid}",method=RequestMethod.DELETE)
	//@RequestMapping(value="",method=RequestMethod.DELETE)
	public ResponseEntity<UserBean> deleteUser(@RequestBody UserBean user, @PathVariable("tid") Integer tid ){
		try {
			boolean flag = userService.deleteUser(user);
			if(flag) {
				user.setSuccess(true);
				user.setMessage("删除数据成功..");
			}
		} catch (BWFException e) {
			e.printStackTrace();
			user.setSuccess(false);
			user.setMessage("删除数据失败.");
		}
		return ResponseEntity.ok(user);  //返回json格式的字符
	}
	
	
	
}
