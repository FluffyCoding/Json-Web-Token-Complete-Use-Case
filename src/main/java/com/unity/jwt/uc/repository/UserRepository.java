package com.unity.jwt.uc.repository;

import com.unity.jwt.uc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    User findUserByUsername(String username);
    User findUserByEmail(String email);

}
