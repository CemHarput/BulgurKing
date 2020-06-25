/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tolga
 */
public class VegetableBurger extends Hamburger {
    private String h;
    public VegetableBurger(String product, String sause, double calorie, double price, int order,String h) {
        super(product, sause, calorie, price, order);
        this.h=h;
    }


    public void HealthyStatus(){
        h="Healthy";
    }
    
    
   
    
    public String Interface_of_budget(){
        return "Budget is Enough";
    }

    @Override
    public String toString() {
        return  super.toString()+"\n"+"HealthStatus:"+h;
    }
    
    public void addtax()
    {
        price += price * 0.10;
    }
    
}
