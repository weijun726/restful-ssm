package com.bwf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwf.bean.UserBean;
import com.bwf.dao.IUserDao;
import com.bwf.exception.BWFException;

/**
 * 
 * @Cacheable()和@CacheEvict()和@CachePut()
 * 
 * @author Administrator
 *
 */
@Service
public class UserService {

	@Autowired private IUserDao userDao;
	
	/**
	 * 新增
	 */
	@Transactional
	public boolean addUser(UserBean user) throws BWFException {
		try {
			userDao.addUser(user);
			return true;
		} catch (Exception e) {
			throw new BWFException(e);
		}
	}
	
	
	/**
	 * 修改
	 */
	@Transactional
	public boolean updateUser(UserBean user) throws BWFException {
		try {
			userDao.updateUser(user);
			return true;
		} catch (Exception e) {
			throw new BWFException(e);
		}
	}
	
	/**
	 * 删除
	 */
	@Transactional
	public boolean deleteUser(UserBean user) throws BWFException {
		try {
			userDao.deleteUser(user.getTid());
			return true;
		} catch (Exception e) {
			throw new BWFException(e);
		}
	}
	
	
	/**
	 * 查询业务
	 * @param user
	 * @return
	 * @throws BWFException
	 */
	public List<UserBean> queryUser(UserBean user) throws BWFException{
		List<UserBean> list = null;
		//从数据库中查询
		list = userDao.queryUser(user);
		return list;
	}
}

