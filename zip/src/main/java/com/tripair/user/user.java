package com.tripair.user;

import java.time.LocalDateTime;
import java.util.List;

import com.tripair.car.car;
import com.tripair.trip.trip;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class user {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String name;
    String email;
    String password;
    String avatar;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    // Um usuário pode ter várias viagens
    @OneToMany(mappedBy = "user")
    List<trip> trips;

    // Um usuário pode ter apenas um carrinho
    @OneToOne(mappedBy = "user")
    car car;
}