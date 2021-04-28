package com.sparkco;

public class Test {
     public static void main(String[] args) {
         extractInt(2.7);
//         Cannot implicitly convert to wrapper 
        extractInt(2);
     }
 
     private static void extractInt(Double obj) {
         System.out.println(obj.intValue());
         
    //     Double d = 2;
     }
}