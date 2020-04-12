package com.example.designpattern.Builder.pizza;

import com.example.designpattern.Builder.pizza.PizzaBuilder;

public class BaharatlıPizzaBuilder extends PizzaBuilder {

    public BaharatlıPizzaBuilder(){
        pizzaTipi = "Baharatlı Pizza";
        sos= "Acı sos, pepperoni, atom biber";
        hamur="ince kenar";
    }
    @Override
    public void SosuHazirla() {
        System.out.println(""+sos);
        System.out.println("Sosunuz hazırlanıyor...");

    }

    @Override
    public void HamuruHazirla() {
        System.out.println(""+hamur);
        System.out.println("Hamurunuz hazırlanıyor...");
    }

    @Override
    public void Pisir() {
        System.out.println(""+pizzaTipi);
        System.out.println("Pizzanız pisiyor...");
    }
}
