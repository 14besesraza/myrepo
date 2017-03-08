/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la3b;

/**
 *
 * @author test1
 */
public class Tables {
    int seats;
    String tab;
    int available;
    
    Tables(String t){
    if(t=="XL" || t=="xl"){
        
        seats=12;
        available=1;
        tab="Extra Large";
    }
    if(t=="L" || t=="l"){
        
        seats=6;
        available=3;
         tab="Large";
    }
    if(t=="M" || t=="m"){
        
        seats=4;
        available=8;
         tab="Medium";
    }
    if(t=="S" || t=="s"){
        
        seats=2;
        available=4;
     tab="Small";
    }
    }
    
   
    
}
