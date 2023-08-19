package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.CarroDto;
import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.CarroModel;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/carro")
public class CarroControllers {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public ResponseEntity<Object> saveCarro(@RequestBody @Valid CarroDto carroDto) {
        if (carroService.existsByLicensePlateCar(carroDto.getLicensePlateCar())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Parking Spot is already in use!");
        }
        var carroModel = new CarroModel();
        BeanUtils.copyProperties(carroDto, carroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroService.save(carroModel));
    }
}
