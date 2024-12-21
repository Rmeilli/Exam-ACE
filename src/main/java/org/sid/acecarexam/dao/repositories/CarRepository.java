package org.sid.acecarexam.dao.repositories;

import org.sid.acecarexam.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    public List<Car> findByModel(String model);

    public List<Car> findByModelAndPrice(String model, double price);

}
