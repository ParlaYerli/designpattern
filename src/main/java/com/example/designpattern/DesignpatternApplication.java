package com.example.designpattern;

import com.example.designpattern.Builder.computer.Computer;
import com.example.designpattern.Builder.pizza.BaharatlıPizzaBuilder;
import com.example.designpattern.Builder.pizza.KarısıkPizzaBuilder;
import com.example.designpattern.Builder.pizza.PizzaBuilder;
import com.example.designpattern.Builder.pizza.SonHamle;
import com.example.designpattern.Builder.user.User;
import com.example.designpattern.Factory.BasePizzaFactory;
import com.example.designpattern.Factory.Pizza;
import com.example.designpattern.Factory.PizzaFactory;
import com.example.designpattern.Singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternApplication.class, args);

        ///////////////// Singleton
        Singleton s = Singleton.getInstance();
        s.write();

        ////////////////// Factory

        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza= pizzaFactory.createPizza("veggie");
        //////////////////////////////////// Builder
        //////user
        User user = new User.UserBuilder("parla","yerli")
                .email("yerliparla@gmail.com")
                .build();
        System.out.println("" +user.getAdi());

        ///////pizza
        PizzaBuilder pizzaBuilder;
        pizzaBuilder= new BaharatlıPizzaBuilder();

        SonHamle ascıParla= new SonHamle();
        ascıParla.Hazırla(pizzaBuilder);

        pizzaBuilder = new KarısıkPizzaBuilder();
        ascıParla.Hazırla(pizzaBuilder);

        ////////computer
        Computer computer1 = new Computer.ComputerBuilder()
                .fiyat("12345")
                .marka("Monster")
                .ram("8")
                .build();
        Computer computer2 = new Computer.ComputerBuilder()
                .fiyat("12332")
                .marka("Asus")
                .ram("16")
                .build();
        System.out.println(""+computer1.getMarka());
        System.out.println(""+computer2.getMarka());
    }

}
