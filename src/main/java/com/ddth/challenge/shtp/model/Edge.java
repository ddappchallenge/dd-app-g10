/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ddth.challenge.shtp.model;

/**
 *
 * @author Zebkixu
 */
public class Edge {
    String from;
    String to;
    int distance;
    int cost;
    
    
    public void setStart(String from){
        
        this.from=from;
        
    }
     public void setEnd(String to){
        
        this.to=to;
        
    }
      public void setDistance(int distance){
        
        this.distance=distance;
        
    }
       public void setCost(int cost){
        
        this.cost=cost;
        
    }
             
        public String getStart(){
        
        return from;
        
    }
        public String getEnd(){
        
        return to;
        
    }
        public int getDistance(){
        
        return distance;
        
    }
        public int getCost(){
        
        return cost;
        
    }
}
