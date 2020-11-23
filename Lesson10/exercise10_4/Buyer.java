/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_4;

/**
 *
 * @author FRIEDRICH
 */

import java.util.HashMap;
import java.util.Map;

public class Buyer {

    private String name;
    private BuyerClass buyerClass;
    
    private Buyer(){
        super();
    }
    
    private Buyer(String name, BuyerClass buyerClass){
        this.name = name;
        this.buyerClass = buyerClass;
    }
    
    public static Buyer getInstance(String name, BuyerClass buyerClass){
        return new Buyer(name, buyerClass);
    }
    
    public String getName(){
        return name;
    }
    
    public BuyerClass getBuyerClass(){
        return buyerClass;
    }
    
    public static Map<String, Buyer> getBuyerMap(){
        Map<String, Buyer> buyerMap = new HashMap<>();
            
        // Create Buyer list
        buyerMap.put("Acme", Buyer.getInstance("Acme Electronics", BuyerClass.SILVER));
        buyerMap.put("BestDeals", Buyer.getInstance("Best Deals", BuyerClass.GOLD));
        buyerMap.put("GreatDeals", Buyer.getInstance("Great Deals", BuyerClass.BASIC));
        buyerMap.put("MomAndPops", Buyer.getInstance("Mom and Pops", BuyerClass.BASIC));
        buyerMap.put("RadioHut", Buyer.getInstance("Radio Hut", BuyerClass.PLATINUM));
        buyerMap.put("PriceCo", Buyer.getInstance("PriceCo", BuyerClass.SILVER));
        
        return buyerMap;
    }
}
