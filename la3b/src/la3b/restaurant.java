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
public class restaurant {
    Tables T;
    Orderr O;
    priority_Q P;
    
    restaurant(Orderr ord,priority_Q pq)
    {
        this.O=ord;
        this.P=pq;      
            
    } 
    public void booking()
    {
      if(T.tab=="XL"|| T.tab=="xl")
      {   
         if(T.available>0)  
         {
             if(O.c_priority>=P.get_highest()) // whoever has highest priority will get the extra large table
             {
           

               T.available--;
             }
         }
      }
      else if(T.tab=="L" || T.tab=="l")
      {
         if (T.available>0)
         {
           

           T.available--;
         }

      }
      else if(T.tab=="M" || T.tab=="m")
      {
         if (T.available>0)
         {
          


           T.available--;
         }
      }
      else if(T.tab=="S" || T.tab=="s")
      {
         if (T.available>0)
         {
           
           T.available--;
         }
      }
    }
}
