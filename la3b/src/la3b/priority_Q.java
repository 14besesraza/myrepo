/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la3b;
import java.util.PriorityQueue;
import java.util.List;

import java.util.Comparator;

        
/**
 *
 * @author test1
 */
public class priority_Q {
  int max;   
	static class PQS implements Comparator<Integer> {
 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
 
	public void queue(List<Integer> a) {
		
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
 
		// use offer() method to add elements to the PriorityQueue pq1
		for (int x : a) {
			p1.offer(x);
		}
 
 
		PQS pqs = new PQS();
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>(10, pqs);
		// In this particular case, we can simply use Collections.reverseOrder()
		// instead of self-defined comparator
		for (int x : a) {
			p2.offer(x);
		}
 
                max= p2.poll();
	}
         public int get_highest()
    {
        return max;
    }
}

