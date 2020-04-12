package com.example.designpattern.Builder.pizza;


public class SonHamle {
    public void Hazırla(PizzaBuilder pizzaBuilder){
        pizzaBuilder.SosuHazirla();
        pizzaBuilder.HamuruHazirla();
        System.out.println("*******Pizzanız hazır :");
        System.out.println("**"+pizzaBuilder.pizzaTipi);
        System.out.println("**"+pizzaBuilder.hamur);
        System.out.println("**"+pizzaBuilder.sos);
    }
}
