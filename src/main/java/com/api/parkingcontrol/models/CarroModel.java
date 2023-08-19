package com.api.parkingcontrol.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CARROS")
public class CarroModel {

    @Id
    @Column(name = "ID_Carro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, unique = true, length = 70)
    private String brandCar;
    @Column(nullable = false, unique = true, length = 70)
    private String modelCar;
    @Column(nullable = false, unique = true, length = 70)
    private String colorCar;
}
