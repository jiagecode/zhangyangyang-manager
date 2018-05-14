package com.zhangyangyang.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zhangyangyang.pojo.ZyyUser;
import com.zhangyangyang.service.ZyyUserService;

/**
 * 商品管理
 * @author Zy
 *
 */
@Controller
public class ZyyUserController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ZyyUserService zyyUserService;
	
	@RequestMapping("getZyyUser/{openid}.do")
	@ResponseBody
	public ZyyUser getZyyUser(@PathVariable String openid){//@PathVariable取出地址栏中的openid名的值
		ZyyUser zyyUser = zyyUserService.findUser(openid);
		System.out.println(JSONObject.toJSON(zyyUser));
		return zyyUser;
	}
}
