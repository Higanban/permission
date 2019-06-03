package com.chen.service.impl;

import com.chen.dto.InsertRoleDto;
import com.chen.dto.RoleDto;
import com.chen.mapper.RoleInfoMapper;
import com.chen.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.RoleInfo;
import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<RoleDto> findRoleInfoByCondition(String condition) {
        return roleInfoMapper.findRoleInfoByCondition(condition);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRoleInfoByRoleId(int roleId) {

        return roleInfoMapper.deleteRoleInfoByRoleId(roleId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRoleMenuInfoById(InsertRoleDto insertRoleDto) {
        roleInfoMapper.deleteRoleMenuInfoById(insertRoleDto);
        return roleInfoMapper.insertRoleMenuInfoById(insertRoleDto) ;

    }
}
