import java.io.*;
import java.util.*;

/*
 *
 * Partition an array such that all non-zero values are at the  beginning.
 */

class Solution {
  
  
  public static void main(String[] args) {
    int myInts[] = {0, 5, 50, 0, 14, 63,100, 0};
   
    System.out.println("Initial Array has:");
    for(int k = 0; k< myInts.length; k++){
      System.out.print(" " + myInts[k] + " ");
    }
    System.out.println("");
    while(myInts.length != 0){
      for(int i = 0; i < myInts.length; i++){
          for(int j =1; j < myInts.length; j++){
            if((i == 0) && (j > 0)){
              int tmp = i;
              i = j;
              j = tmp;
              
            }else if((i == 0) && (j == 0)){
              j++;
            }
        }
     }
      System.out.println("");
          System.out.println("Final Array has:");
    for(int l = 0; l < myInts.length; l++){
      System.out.print(" "+myInts[l] +" ");
    }
      break;
  }
    System.out.println("Final Array has:");
    for(int l = 0; l < myInts.length; l++){
      System.out.print(" "+myInts[l] +" ");
    }
}
}


          
