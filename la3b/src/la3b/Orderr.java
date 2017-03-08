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
import java.util.ArrayList;
import java.util.List;

class Orderr {
    String type;            
    int items;              
    int total_members;     
    List<Integer> List1 = new ArrayList();
    Tables T;
    priority_Q PQ;
    int c_priority;             // 5 is highest and 1 is lowest
    
    public void set_priority()
    {
        if(total_members>=10)
           c_priority=5;
        
        else if( total_members>=8 && total_members<10)
           c_priority=4;
        
        else if(total_members>=6 && total_members<8)
           c_priority=3;
        
        else if(total_members>=4 && total_members<6)
           c_priority=2;
        
        if(total_members <4)
           c_priority=1;
    }        
        public int get_priority()
    {
        return c_priority;
    }
    
    Orderr(String a, int b, int c,String t, priority_Q pq,Tables TB){
       
        this.type=a;
        this.items=b;
        this.total_members=c;                              
        this.PQ=pq;
        this.T=TB;
        set_priority();
        this.List1.add(get_priority());
        PQ.queue(List1);
        T=new Tables(t);
    }
    
}