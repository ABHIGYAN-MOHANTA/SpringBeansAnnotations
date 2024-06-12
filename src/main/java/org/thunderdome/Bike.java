package org.thunderdome;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    public void drive(){
        System.out.println("Clutch Brake Kick Accelerator Vroom Nitro.....");
    }
}
