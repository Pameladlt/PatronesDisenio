/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author Y700
 */
public class Guacamole extends Decorator {
    
    Burger burger;
    
    public Guacamole(Burger burger){
        this.burger = burger;
    }
    
    public String getDescription() {
        return burger.getDescription() + ", Guacamole";
    }

    
    public double cost() {
        return 0.99 + burger.cost();
    }
    
}
