
package com.mayab.patrones.stategy;


public class repocategoria extends Reporte {

    public repocategoria(){
        this.sort = new sortcatego();
    }
    
    public void displaytrans() {
        this.sort.sortear();
    }

   
}
