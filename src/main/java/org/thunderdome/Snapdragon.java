package org.thunderdome;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
    @Override
    public void Process() {
        System.out.println("World best processor");
    }
}
