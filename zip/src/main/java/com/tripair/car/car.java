package com.tripair.car;

import java.util.List;

import com.tripair.trip.trip;
import com.tripair.user.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "car")
@Data
public class car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    // Um carrinho pode ter várias viagens
    @OneToMany(mappedBy = "car")
    List<trip> trips;

    // Um carrinho pode ter somente um usuário
    @OneToOne
    user user;

    float valorCar;
}
