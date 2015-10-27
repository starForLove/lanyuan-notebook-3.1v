package com.lanyuan.mapper;

import java.util.List;

import com.lanyuan.entity.ResFormMap;
import com.lanyuan.mapper.base.BaseMapper;

public interface ResourcesMapper extends BaseMapper {
	public List<ResFormMap> findChildlists(ResFormMap map);

	public List<ResFormMap> findRes(ResFormMap map);

	public void updateSortOrder(List<ResFormMap> map);
	
	public List<ResFormMap> findUserResourcess(String userId);
	
	//ekko 2015年10月27日11:00:55
	public List<ResFormMap> findRoleResourcess(String roleId);
	
}
