/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tolga
 */

//if not abstrack, giving error, first made it public class

public  class ChickenBurger extends Hamburger{
    private String portion;
    private String h;

    public ChickenBurger(String product, String sause, double calorie, double price, int order,String portion,String h) {
        super(product, sause, calorie, price, order);
        this.portion=portion;
        this.h=h;
    }
    public void orderString(){
    if(order<1)
        portion= "Not Acceptable \n";
    else if(order<2)
        portion= "Minimum \n";
    else if(order <3)
        portion= "2 Person \n";
    else
        portion= "Custom order  found\n";
    
    
    }

    

    

    
    public void HealthyStatus(){
        h=" Not Healthy";
    }

    @Override
    public String toString() {
        
        return ""+super.toString() +"\nHealth Status:" +h+ "\nPortion is" + portion + '}';
    }
    public void addtax()
    {
        price += price * 0.18;
    }
    
    
}
