package com.renzo.zelda.search.service;

import com.renzo.zelda.search.entity.UserEntity;
import com.renzo.zelda.search.mapper.UserMapper;
import com.renzo.zelda.search.model.User;
import com.renzo.zelda.search.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;

    public List<User> findByUsers(){
        return userMapper.userEntityListToUserList(userRepository.findAll());
    }

    public User createUser(User user) {
        UserEntity userEntity= userMapper.userToUserEntity(user);
        return userMapper.userEntityToUser(
                userRepository.save(userEntity)
        );
    }
}
