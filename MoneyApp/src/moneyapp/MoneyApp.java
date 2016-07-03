/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyapp;

/**
 *
 * @author YOGA 500
 */
public class MoneyApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Room number 1");
        int moneyWater = CalculateWater(200, 150);
        System.out.println("Total money of water is "+ moneyWater);
        
        int moneyElec = CalculateElec(1000, 800);
        System.out.println("Total money of elective is " + moneyElec);
        
        int costRoom = 4000; // cost depaend on each room
        int costCar = 200; // cost car depend on ach room
        int allPay = costCar + costRoom + moneyElec + moneyWater;
        System.out.println("This room have to pay equal "+ allPay);
    }
    
    static void costRoom(int roomNumber){
        
    }
    
    static int CalculateWater(int nowW, int beforeW){
        int unitW = nowW - beforeW;  
        return unitW*18;
    }
    
    static int CalculateElec(int nowE, int beforeE){
        int unitE = nowE - beforeE;
        return unitE*8;
    }
}
