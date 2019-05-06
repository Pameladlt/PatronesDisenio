
package com.mayab.patrones.stategy;


public abstract class Reporte extends BankAcc {
    sortable sort;
    
    public abstract void displaytrans();
    public void setsort(sortable sort){
        this.sort = sort;
    }
    

}
