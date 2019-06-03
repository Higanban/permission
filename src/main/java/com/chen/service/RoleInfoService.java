package com.chen.service;

import com.chen.dto.InsertRoleDto;
import com.chen.dto.RoleDto;

import java.util.List;

public interface RoleInfoService {
    List<RoleDto> findRoleInfoByCondition(String condition);

    int deleteRoleInfoByRoleId(int roleId);

    int deleteRoleMenuInfoById(InsertRoleDto insertRoleDto);



}
