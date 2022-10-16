/*
 Write a program that prints the temperature closest to 0 among input data. 
 If two numbers are equally close to zero, positive integer has to be considered closest to zero 
 (for instance, if the temperatures are -5 and 5, then display 5).
 */

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result = 0; 

        //if there is no temperature, the result will be 0
        if(n == 0) result = 0;

        for (int i = 0; i < n; i++) {
          int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

          //set the first temperature as a result
          if(i == 0) result = t;
          else if(Math.abs(t) < Math.abs(result)) result = t;

          //in case the temperatures are same 
          //if either one of them is grater than 0, the result will be an absolute
          if(Math.abs(t) == Math.abs(result) && result > 0 || t >0) result = Math.abs(result);
        }
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        in.close();
        System.out.println(result);
    }    
}