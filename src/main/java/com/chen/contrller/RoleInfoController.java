package com.chen.contrller;

import com.chen.dto.InsertRoleDto;
import com.chen.dto.RoleDto;
import com.chen.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class RoleInfoController {
    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("findRoleInfoByCondition")
    public Object findRoleInfoByCondition(@RequestParam String condition) throws UnsupportedEncodingException {
        return roleInfoService.findRoleInfoByCondition(condition);
    }

    //删除角色
    @RequestMapping("deleteRoleInfoByRoleId")
    public Object deleteRoleInfoByRoleId(@RequestParam int roleId) {
        return roleInfoService.deleteRoleInfoByRoleId(roleId);
    }

    //新分配角色

    @RequestMapping("assignRoleByRoleId")
    public Object assignRoleByRoleId(@RequestBody InsertRoleDto insertRoleDto) {

        return roleInfoService.deleteRoleMenuInfoById(insertRoleDto);
    }
}
