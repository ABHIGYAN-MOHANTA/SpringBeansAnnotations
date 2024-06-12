package org.thunderdome;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    @Override
//    public String toString() {
//        return "Tyre{" +
//                "brand='" + brand + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Swoosh";
    }

//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    private String brand;
}
