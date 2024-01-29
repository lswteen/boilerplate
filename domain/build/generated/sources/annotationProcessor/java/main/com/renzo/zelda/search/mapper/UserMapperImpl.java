package com.renzo.zelda.search.mapper;

import com.renzo.zelda.search.entity.UserEntity;
import com.renzo.zelda.search.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-29T22:29:12+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity userToUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        Long userId = null;
        String keyword = null;
        String gender = null;

        userId = user.userId();
        keyword = user.keyword();
        gender = user.gender();

        UserEntity userEntity = new UserEntity( userId, keyword, gender );

        return userEntity;
    }

    @Override
    public List<User> userEntityListToUserList(List<UserEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( entityList.size() );
        for ( UserEntity userEntity : entityList ) {
            list.add( userEntityToUser( userEntity ) );
        }

        return list;
    }
}
