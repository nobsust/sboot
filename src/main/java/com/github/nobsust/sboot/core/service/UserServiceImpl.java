package com.github.nobsust.sboot.core.service;

import com.github.nobsust.sboot.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User saveUser(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public User findByUsername(String username) {
        User user = new User();
        user.setEmail("email");
        user.setUsername("usrname");
        user.setPassword("somesecret");
        return user;
    }
}
