package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.UserEntity;
import com.renzo.zelda.search.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void usrEntityToUserMapping(){
        UserEntity entity = new UserEntity(1L,"keyword","gender");
        User user = UserMapper.INSTANCE.userEntityToUser(entity);

        assertEquals(entity.getUserId(),user.userId());
        assertEquals(entity.getKeyword(),user.keyword());
        assertEquals(entity.getGender(),user.gender());
    }

}