
package com.mayab.patrones.stategy;

import java.util.ArrayList;

public class BankAcc {
    
      ArrayList<transaction> trans;
    public double estadocuenta;
    
     public BankAcc(){
        this.trans = new ArrayList<transaction>();
        this.estadocuenta = 0;
    } 
     
  
    
      public void addtrans(transaction trans){
        this.trans.add(trans);
        this.estadocuenta = this.estadocuenta + trans.cantidad;
    }
      
   
      
    public void deletetrans(transaction trans){
        this.trans.remove(trans);
        this.estadocuenta = this.estadocuenta - trans.cantidad;
    }
}
