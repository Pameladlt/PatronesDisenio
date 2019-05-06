
package com.mayab.patrones.decorator;

public class Bacon extends Decorator {
    
     Burger burger;
    
    public Bacon(Burger burger){
        this.burger = burger;
    }
    
    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }

    
    public double cost() {
        return 1.99 + burger.cost();
    }
    
}
