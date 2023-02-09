package com.castly7.issuemanagement.repository;

import com.castly7.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName (String username);
}
