package com.bwf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bwf.bean.UserBean;
import com.bwf.exception.BWFException;

/**
 * 持久层接口
 * 
 * @author Administrator
 *
 */
@Repository
public interface IUserDao {

	public boolean addUser(UserBean user) throws BWFException;
	

	public boolean updateUser(UserBean user) throws BWFException;

	public boolean deleteUser(Integer tid) throws BWFException;

	public List<UserBean> queryUser(UserBean user) throws BWFException;

}
