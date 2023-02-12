package com.castly7.issuemanagement.service.impl;

import com.castly7.issuemanagement.entity.User;
import com.castly7.issuemanagement.repository.UserRepository;
import com.castly7.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id){
        return userRepository.getOne(id);
    }
    @Override
    public Page<User> getAllPageable(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.findByUserName(username);
    }

}
