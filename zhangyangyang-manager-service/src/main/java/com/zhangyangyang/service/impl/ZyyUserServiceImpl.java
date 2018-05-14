package com.zhangyangyang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangyangyang.mapper.ZyyUserMapper;
import com.zhangyangyang.pojo.ZyyUser;
import com.zhangyangyang.pojo.ZyyUserExample;
import com.zhangyangyang.service.ZyyUserService;

/**
 * 商品管理
 * @author Zy
 *
 */
@Service
public class ZyyUserServiceImpl implements ZyyUserService {

	@Autowired
	private ZyyUserMapper zyyUserMapper;
	
	@Override
	public ZyyUser findUser(String openid) {
		return zyyUserMapper.selectByPrimaryKey(openid);
	}

}
