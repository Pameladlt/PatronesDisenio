
package com.mayab.patrones.stategy;


public class reporfecha extends Reporte{

    public reporfecha(){
        this.sort = new sortfecha();
    }

    @Override
    public void displaytrans() {
        this.sort.sortear();
    }
    
    
}
