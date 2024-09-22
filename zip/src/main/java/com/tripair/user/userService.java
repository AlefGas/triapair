package com.tripair.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tripair.user.DTO.UserProfileResponse;

@Service
public class userService {
    @Autowired
    userRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<user> findAll(){
        return repository.findAll();
    }

    public List<user> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
    
    public UserProfileResponse getUserProfile(String email) {
        return repository.findByEmail(email)
                .map(UserProfileResponse::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    public user create(user user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

}
