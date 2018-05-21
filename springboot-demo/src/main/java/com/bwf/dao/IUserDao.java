package com.bwf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bwf.bean.UserBean;

/**
 * 持久层
 * 
 *   此接口中只需要扩展增删改以外的方法
 * 
 * @author Administrator
 *
 */
public interface IUserDao extends JpaRepository<UserBean, Integer>{
	
	public UserBean findByUname(String uname); 

}
