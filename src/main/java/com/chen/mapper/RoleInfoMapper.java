package com.chen.mapper;

import com.chen.dto.InsertRoleDto;
import com.chen.dto.RoleDto;

import java.util.List;

public interface RoleInfoMapper {
    List<RoleDto> findRoleInfoByCondition(String condition);

    int deleteRoleInfoByRoleId(int roleId);

    int deleteRoleMenuInfoById(InsertRoleDto insertRoleDto);

    int insertRoleMenuInfoById(InsertRoleDto insertRoleDto);
}
