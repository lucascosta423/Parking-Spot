package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.CarroModel;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Transactional
    public CarroModel save(CarroModel carroModel) {
        return carroRepository.save(carroModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return carroRepository.existsByLicensePlateCar(licensePlateCar);
    }
    public boolean existsById(Integer id) {
        return carroRepository.existsById(id);
    }
}
