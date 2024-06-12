package org.thunderdome;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor{

    @Override
    public void Process() {
        System.out.println("2nd Best processor");
    }
}
