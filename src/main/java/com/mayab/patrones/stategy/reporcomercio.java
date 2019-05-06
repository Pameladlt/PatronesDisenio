
package com.mayab.patrones.stategy;


public class reporcomercio extends Reporte{

    public reporcomercio(){
        this.sort = new sortcomercio();
    }
    
    public void displaytrans() {
        this.sort.sortear();
    }

   

    
}
