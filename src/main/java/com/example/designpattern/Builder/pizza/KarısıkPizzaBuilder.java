package com.example.designpattern.Builder.pizza;

import com.example.designpattern.Builder.pizza.PizzaBuilder;

public class KarısıkPizzaBuilder extends PizzaBuilder {
    public KarısıkPizzaBuilder(){
        pizzaTipi = "Karısık Pizza";
        sos= "Biber, Domates, Peynir, Salam, Sosis";
        hamur="ince kenar,fesleğenli";
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
