package org.example;

import org.springframework.stereotype.Component;

@Component
public class hatchbackproductionLine implements ProductionLine{
    @Override
    public void work() {
      System.out.println("Хэтч сделан");
    }
}
