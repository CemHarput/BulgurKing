/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tolga
 */
 public abstract class Hamburger  extends BulgurKing implements HamburgerInterface{
    
    

    public Hamburger(String product, String sause, double calorie, double price, int order) {
        super(product, sause, calorie, price, order);
        
        
    }

    @Override
    public String toString() {
        return "" +super.toString();
    }






    
    
    
}
