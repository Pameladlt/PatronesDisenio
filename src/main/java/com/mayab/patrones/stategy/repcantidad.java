
package com.mayab.patrones.stategy;

public class repcantidad extends Reporte{

    public repcantidad(){
        this.sort = new sortcantidad();
    }
    
    public void displaytrans() {
        sort.sortear();
    }

    
}
