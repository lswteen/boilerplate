package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.UserEntity;
import com.renzo.zelda.search.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userEntityToUser(UserEntity entity);
    UserEntity userToUserEntity(User user);

    List<User> userEntityListToUserList(List<UserEntity> entityList);
}
