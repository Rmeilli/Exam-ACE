package org.sid.acecarexam.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {
    @Id
    @GeneratedValue
    Long id_Car;
    String model;
    String color;
    String matricul;
    double price;

    public Car(Long id_Car, String model, String color, String matricul, double price) {
        this.id_Car = id_Car;
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }
}
