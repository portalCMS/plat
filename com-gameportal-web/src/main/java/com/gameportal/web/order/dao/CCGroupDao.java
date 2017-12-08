package com.gameportal.web.order.dao;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.gameportal.web.order.model.CCGroup;
import com.gameportal.web.user.dao.BaseIbatisDAO;


@Component
public class CCGroupDao extends BaseIbatisDAO{

	public Class<CCGroup> getEntityClass() {
		return CCGroup.class;
	}
	
	public boolean saveOrUpdate(CCGroup entity) {
		if(entity.getCcgid() == null) 
			return StringUtils.isNotBlank(ObjectUtils.toString(save(entity))) ? true
					: false;
		else 
			return update(entity);
	}

}
