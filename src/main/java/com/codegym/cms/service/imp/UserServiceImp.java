package com.codegym.cms.service.imp;

import com.codegym.cms.model.User;
import com.codegym.cms.repository.UserRepository;
import com.codegym.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
