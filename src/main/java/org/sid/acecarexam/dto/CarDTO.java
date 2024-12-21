package org.sid.acecarexam.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString
public class CarDTO {

    String model;
    String color;
    String matricul;
    double price;


    public CarDTO(String model, String color, String matricul, double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }
}
