/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tolga
 */
abstract public class BulgurKing {
    
   protected  String product;
   protected String sause;
   protected double calorie;
   protected double price;
   protected int order;
   
   private static int numberOfOrders=0;

    public BulgurKing() {
    }

    public BulgurKing(String product, String sause, double calorie, double price, int order) {
        this.product = product;
        this.sause = sause;
        this.calorie = calorie;
        this.price = price;
        this.order = order;
        numberOfOrders++;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    

    @Override
    public String toString() {
        return "\nBulgurKing{" + "\nproduct=" + product + "\n sause=" + sause + "\n calorie=" + calorie + "\n price=" + price + "\n order=" + order  ;
    }
    
    
    
    public static String which_order(BulgurKing Hamburger, BulgurKing Drink)
    {
        if(Hamburger.price>Drink.price)
            return "Drink Price Included\n"+Hamburger.toString();
        else
            return "Drink Price Not Included\n"+Drink.toString();
        
    }
    
    public static int getNumberOfOrders()
    {
        return numberOfOrders;
    }
    
}
