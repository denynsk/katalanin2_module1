package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
//        ProductionLine productionLine = new sedanproductionline();
//       ProductionLine productionLine1 = new hatchbackproductionLine();
//       CarFactory carFactory = new CarFactory(6, productionLine1);
//       carFactory.RunProduction();
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        CarFactory carFactory = ctx.getBean("carFactory", CarFactory.class);
//        CarFactory carFactory1 = ctx.getBean("carFactory", CarFactory.class);
//        carFactory.setProductionSize(6);
//        carFactory1.setProductionSize(2);
        System.out.println(carFactory.getProductionSize());
//        System.out.println(carFactory1.getProductionSize());
//        carFactory.RunProduction();
//        carFactory1.RunProduction();
//        System.out.println(carFactory.toString());
//        System.out.println(carFactory1.toString());
//        System.out.println(carFactory.hashCode());
//        System.out.println(carFactory1.hashCode());


        System.out.println(ctx.getBeanDefinitionCount());
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
