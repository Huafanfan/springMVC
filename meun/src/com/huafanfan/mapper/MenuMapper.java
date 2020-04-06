package com.huafanfan.mapper;

import java.util.List;

import com.huafanfan.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
