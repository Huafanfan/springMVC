package com.huafanfan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huafanfan.mapper.UsersMapper;
import com.huafanfan.pojo.Users;
import com.huafanfan.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public int insRegister(Users users) {
		return usersMapper.insUsers(users);
	}

}
