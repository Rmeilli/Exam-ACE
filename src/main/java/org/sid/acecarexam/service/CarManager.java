package org.sid.acecarexam.service;

import lombok.AllArgsConstructor;
import org.sid.acecarexam.dao.entities.Car;
import org.sid.acecarexam.dao.repositories.CarRepository;
import org.sid.acecarexam.dto.CarDTO;
import org.sid.acecarexam.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;


    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        return carMapper.fromCarToCarDto(carRepository.save(carMapper.fromCarDtoToCar(carDTO)));
    }



    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOS;
    }




    // Implement methods to manage cars (CRUD operations)
}
