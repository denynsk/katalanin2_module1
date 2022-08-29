package org.example;

import org.springframework.stereotype.Component;

@Component("SedanPL")
public class sedanproductionline implements ProductionLine{

    @Override
    public void work() {
        System.out.println("Седан выпущен");
    }
}
