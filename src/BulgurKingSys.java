/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ZH
 */
public class BulgurKingSys {
    public static ArrayList<BulgurKing> menulist=new ArrayList();
 

    
    public static String getAllMenu() {
        String res = "";
        for (BulgurKing v : menulist) {
            res += v.toString();
        }
        return res;
    }


     
    
    public static boolean  addBurger(Hamburger a)
    {
        for(int i=0; i<menulist.size(); i++)
            if(menulist.get(i).product==a.product)
                return false;
        menulist.add(a);
            return true;
        
    }

    
    

        public static Hamburger searchPrice(double price)
    {
        for (int i = 0; i < menulist.size(); i++) {
            Hamburger get = (Hamburger) menulist.get(i);
            if(price == get.getPrice())
            {
                return get;
            }
        }
        return null;
    }
    
    
    
    
    
    
    public static boolean deleteburgerbyprice(double price){
        for(int i=0; i<menulist.size(); i++)
            if(menulist.get(i).price==price)
            {
                menulist.remove(i);
                return true;
            }
        return false;
    }
    
    public static String displayWithString(){
        String res="";
        for(int i=0;i<menulist.size(); i++){
            res+=menulist.get(i).toString();
           
        }
        return res;
}
    
}
