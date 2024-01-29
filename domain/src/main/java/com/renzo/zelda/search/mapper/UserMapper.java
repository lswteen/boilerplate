package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.UserEntity;
import com.renzo.zelda.search.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    default User userEntityToUser(UserEntity entity){
        if(entity == null){
            return null;
        }else{
            Long userId = entity.getUserId();
            String keyword = entity.getKeyword();
            String gender = entity.getGender();
            return User.builder()
                    .userId(userId)
                    .keyword(keyword)
                    .gender(gender)
                    .build();
        }
    }

    UserEntity userToUserEntity(User user);

    List<User> userEntityListToUserList(List<UserEntity> entityList);
}
