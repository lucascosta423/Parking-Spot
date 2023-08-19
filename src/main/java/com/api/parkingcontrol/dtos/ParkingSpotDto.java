package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotDto {
  @NotBlank
  private String parkingSpotNumber;
  @NotBlank
  private String responsibleName;
  @NotBlank
  private String apartment;
  @NotBlank
  private String block;

  @NotNull(message = "Carro ID obrigatório")
  @Min(1)
  private Integer carroId;
}
