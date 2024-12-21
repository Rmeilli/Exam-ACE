package org.sid.acecarexam.service;

import org.sid.acecarexam.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDto);

    public List<CarDTO> getCarByModel(String model);

}
