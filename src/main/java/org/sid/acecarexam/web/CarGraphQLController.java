package org.sid.acecarexam.web;

import org.sid.acecarexam.dto.CarDTO;
import org.sid.acecarexam.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class CarGraphQLController {

    private CarService carService ;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car){
        return carService.saveCar(car);
    }


    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }


}
