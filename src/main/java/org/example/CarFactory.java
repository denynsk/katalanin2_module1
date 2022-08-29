package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class CarFactory {
    private int productionSize;
    @Autowired
    @Qualifier("SedanPL")

    private ProductionLine ProductionLine;

    public CarFactory() {
    }

    public CarFactory(org.example.ProductionLine productionLine) {
        ProductionLine = productionLine;
    }

    public CarFactory(int productionSize, ProductionLine ProductionLine)
    {
        this.ProductionLine = ProductionLine;
        this.productionSize = productionSize;
    }

    public void RunProduction() {
        int CarBuilt = 0;
        while (CarBuilt < productionSize)
        { ProductionLine.work(); CarBuilt++;}
    }

    public int getProductionSize() {
        return productionSize;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }
    @PostConstruct
    public void initMethod() {
        productionSize = 9;
        System.out.println("CarFactory к работе готов");
    }
    @PreDestroy
    public void destroyMethod() {
        System.out.println("CarFactory покинул нас");
    }
}
