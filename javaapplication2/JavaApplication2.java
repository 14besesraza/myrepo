/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author sraza.bese14seecs
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m1[][]={{1,2},{3,4}};
        int m2[][]={{2,1},{3,4}};
        
        matrix m = new matrix(2,2,2,2,m1,m2);
        int res[][]=m.itera();
        for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.print(res[i][j] + " ");
           }
           System.out.println();
       }
    }
    
}
