package com.tripair.user.DTO;
import com.tripair.user.user;

public record UserProfileResponse(
        String name,
        String email
       
) {
    public UserProfileResponse(user user){
        this(user.getName(), user.getEmail());
    }
}