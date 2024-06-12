package org.thunderdome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung {

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
    @Autowired
    @Qualifier("mediaTek")
    MobileProcessor cpu;

    public void config(){
        System.out.println("Octa Core , 4gb ram, 12 mega pixel camera");
        cpu.Process();
    }
}
