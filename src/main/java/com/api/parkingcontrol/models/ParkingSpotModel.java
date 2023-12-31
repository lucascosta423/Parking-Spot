package com.api.parkingcontrol.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  @Column(nullable = false, unique = true, length = 10)
  private String parkingSpotNumber;
  @Column(nullable = false)
  private LocalDateTime registrationDate;
  @Column(nullable = false, length = 130)
  private String responsibleName;
  @Column(nullable = false, length = 30)
  private String apartment;
  @Column(nullable = false,length = 30)
  private String block;
  @OneToOne
  @JoinColumn(name = "carro_id")
  private CarroModel carroId;

}
