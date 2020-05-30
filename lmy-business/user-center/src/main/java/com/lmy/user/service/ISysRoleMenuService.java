package com.lmy.user.service;

import com.lmy.user.model.SysRoleMenu;
import com.lmy.common.model.SysMenu;
import com.lmy.common.service.ISuperService;

import java.util.List;
import java.util.Set;

/**
 * @author lmy
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
	int save(Long roleId, Long menuId);

	int delete(Long roleId, Long menuId);

	List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

	List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
