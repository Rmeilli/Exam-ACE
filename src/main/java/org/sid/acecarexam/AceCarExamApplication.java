package org.sid.acecarexam;

import org.sid.acecarexam.dao.entities.Car;
import org.sid.acecarexam.dao.repositories.CarRepository;
import org.sid.acecarexam.dto.CarDTO;
import org.sid.acecarexam.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AceCarExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(AceCarExamApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            List<Car> cars = List.of(
                    Car.builder().model("model1").color("orange").matricul("ABC223").price(4989898).build(),
                    Car.builder().model("model2").color("black").matricul("wfu3224").price(11000).build(),
                    Car.builder().model("Model3").color("yellow").matricul("fiwueiu32").price(5000).build(),
                    Car.builder().model("Model4").color("red").matricul("ncjwij3").price(4387).build()
            );
            carRepository.saveAll(cars);

        };
    }
}
