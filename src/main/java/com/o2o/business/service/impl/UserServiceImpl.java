/**
 * 
 */
package com.o2o.business.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.google.gson.Gson;
import com.o2o.business.service.UserService;
import com.o2o.dao.UserDao;
import com.o2o.dao.pojo.User;
import com.o2o.framework.core.log.Logger;
import com.o2o.framework.core.log.LoggerFactory;
import com.o2o.model.param.UserBo;

/**
 * @author lenovo
 *
 */

public class UserServiceImpl implements UserService{
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource UserDao userDao;
	
	public boolean register(UserBo bo) {
		logger.info("[o2o][service.impl] register user info :{}", new Object[]{new Gson().toJson(bo).toString()});
		User user = new User();
		BeanUtils.copyProperties(bo, user);
		Integer id = userDao.insert(user);
		if(id.intValue()>0){
			return true;
		}
		return false;
	}

}
