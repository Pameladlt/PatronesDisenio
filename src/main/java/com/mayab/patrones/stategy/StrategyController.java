
package com.mayab.patrones.stategy;


public class StrategyController {

  
    public static void main(String[] args) {
   
        
        repocategoria categoria = new repocategoria();
        categoria.displaytrans();
        reporfecha fecha = new reporfecha();
        fecha.displaytrans();
        reporcomercio comercio =  new reporcomercio();
        comercio.displaytrans();
        repcantidad cantidad = new repcantidad();
        cantidad.displaytrans();

        
        

        
    }
    
}
