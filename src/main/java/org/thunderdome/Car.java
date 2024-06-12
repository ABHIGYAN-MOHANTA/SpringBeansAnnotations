package org.thunderdome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Autowired
    private Tyre tyre;

    public void drive(){
        System.out.println("Vroom Vroom Full Speed Drift Nitro..."+tyre);
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
