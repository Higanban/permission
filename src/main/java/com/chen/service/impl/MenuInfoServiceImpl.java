package com.chen.service.impl;

import com.chen.dto.MenuInfoDto;
import com.chen.mapper.MenuInfoMapper;
import com.chen.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<MenuInfoDto> getAllMenuInfo(int roleId) {
        return menuInfoMapper.getAllMenuInfo(roleId);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<MenuInfoDto> listMenuByUserId(int userId) {
        return menuInfoMapper.listMenuByUserId(userId);
    }


}
