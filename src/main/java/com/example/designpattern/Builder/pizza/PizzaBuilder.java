package com.example.designpattern.Builder.pizza;

public abstract class PizzaBuilder{
    public String pizzaTipi;
    public String hamur;
    public String sos;

    public abstract void SosuHazirla();
    public abstract void HamuruHazirla();
    public abstract void Pisir();

    public PizzaBuilder pizzaTipi(String pizzaTipi){
        this.pizzaTipi= pizzaTipi;
        return this;
    }
    public PizzaBuilder hamur(String hamur){
        this.hamur= hamur;
        return this;
    }
    public PizzaBuilder sos(String sos){
        this.sos=sos;
        return this;
    }
    public Pizza build(){
        return new Pizza(this);
    }
}