package com.security.repo;

import com.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    Optional<User> findByUsername(String username);
}
