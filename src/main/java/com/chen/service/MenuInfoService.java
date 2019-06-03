package com.chen.service;

import com.chen.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoService {
    List<MenuInfoDto> getAllMenuInfo(int roleId);

    List<MenuInfoDto> listMenuByUserId(int userId);

}
