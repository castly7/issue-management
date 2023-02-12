package com.castly7.issuemanagement.service;

import com.castly7.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User getById(Long id);
    Page<User> getAllPageable(Pageable pageable);
    User getByUserName (String username);

}
