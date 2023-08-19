package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Integer> {
    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsById(Integer id);

}
