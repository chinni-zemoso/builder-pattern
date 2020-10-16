package com.zemoso.test;

import com.zemoso.builder.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PizzaOrder {
    private static final Logger logger = LoggerFactory.getLogger(PizzaOrder.class);

    public static void main(String[] args) {
        //customer1: Need 2 pizzas with cheese, pepperoni, bacon
        Pizza pizza = new Pizza.Builder(2)
                .cheese(true)
                .pepperoni(true)
                .sausage(true)
                .build();
        logger.info(String.valueOf(pizza));

        //customer2: Need 3 pizzas with only cheese
        pizza = new Pizza.Builder(3)
                .cheese(true)
                .build();
        logger.info(String.valueOf(pizza));
    }

}
