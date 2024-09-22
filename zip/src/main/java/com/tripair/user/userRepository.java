package com.tripair.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {

    List<user> findByNameContainingIgnoreCase(String name);

    Optional<user> findByEmail(String email);
    
}
