package com.tripair.car.DTO;

import com.tripair.car.car;
import com.tripair.user.user;

public record CartRequest(float valorCar) {

        public car toModel(user user) {
            return car.builder()
                    .valorCar(valorCar)
                    .user(user) // Associar o carrinho ao usuário
                    .build();
        }
    }

