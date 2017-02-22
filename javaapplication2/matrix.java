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
public class matrix {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sraza.bese14seecs
 */

    
            int row1,column1;
            int row2,column2;
            int mat1[][];
            int mat2[][];
            int add;
          
            
   
            matrix(int r1,int c1,int r2, int c2,int f[][],int s[][]){
                row1=r1;
              column1=c1;
               row2=r2;
                column2=c2;
               add=0;
              
              mat1=f;
               mat2=s;
            }
         public int[][] itera(){
        int result[][]= new int[row1][column2];
        if(column1!=row2)
            return null;
        else{
          for ( int c = 0 ; c < row1 ; c++ )
         {
            for ( int d = 0 ; d < column2 ; d++ )
            {   
               for ( int k = 0 ; k < row1 ; k++ )
               {
                  add = add + mat1[c][k]*mat2[k][d];
               }
 
              result[c][d] = add;
               add = 0;
            }
         }
        }
        return result;
    }
}

    

