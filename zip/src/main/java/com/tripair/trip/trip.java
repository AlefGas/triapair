package com.tripair.trip;

import com.tripair.car.car;
import com.tripair.user.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "trips")
@Data
public class trip {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String nameLocal;
    float valor;
    String fotourl;

    // Várias viagens podem ter um único usuário
    @ManyToOne
    user user;

    // Uma viagem pode ter apenas um carrinho
    @OneToOne
    car car;
}

