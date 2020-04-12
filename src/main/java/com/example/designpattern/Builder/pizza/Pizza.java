package com.example.designpattern.Builder.pizza;

public class Pizza {
    private String pizzaTipi;
    private String hamur;
    private String sos;

    public Pizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.pizzaTipi = getPizzaTipi();
        pizzaBuilder.hamur = getHamur();
        pizzaBuilder.sos = getSos();
    }

    public String getPizzaTipi() {
        return pizzaTipi;
    }

    public void setPizzaTipi(String pizzaTipi) {
        this.pizzaTipi = pizzaTipi;
    }

    public String getHamur() {
        return hamur;
    }

    public void setHamur(String hamur) {
        this.hamur = hamur;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }


}
