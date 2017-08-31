package com.github.nobsust.sboot.core.service;

import com.github.nobsust.sboot.core.domain.User;

public interface UserService {

    User saveUser(User entity);

    User findByUsername(String username);

}