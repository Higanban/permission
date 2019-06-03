package com.chen.mapper;

import com.chen.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoMapper {
    List<MenuInfoDto> getAllMenuInfo(int roleId);

    List<MenuInfoDto> listMenuByUserId(int userId);

}
