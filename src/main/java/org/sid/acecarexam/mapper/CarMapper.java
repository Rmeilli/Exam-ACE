package org.sid.acecarexam.mapper;

import org.modelmapper.ModelMapper;
import org.sid.acecarexam.dao.entities.Car;
import org.sid.acecarexam.dto.CarDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }

}
