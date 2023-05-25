package com.ducminh.StyLash.mapper;

import com.ducminh.StyLash.model.User;
import com.ducminh.StyLash.rest.dto.UserDto;

public interface UserMapper {

    UserDto toUserDto(User user);
}