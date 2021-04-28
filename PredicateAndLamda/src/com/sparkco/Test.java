package com.sparkco;

import java.util.function.Predicate;

/*
 https://www.geeksforgeeks.org/functional-interfaces-java/


@FunctionalInterface
public interface Predicate<T>
{
   public boolean test(T  t);
 }
 
 */

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 

public class Test {
     public static void main(String[] args) {
         String [] arr = {"*", "**", "***", "****", "*****", "******"};
         
         
         Predicate<String> pr1 = s -> s.length() < 4;
         print(arr, pr1);
         System.out.println("================================");
         print(arr, s -> s.length() < 3);
         System.out.println("================================");
         
         printArea(55, x -> x * x);
         printArea(10, x -> x * x);
         
         
     }
 
     private static void print(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }

     private static void printArea(int side, Square getArea) {
         System.out.println(getArea.calculate(side));             
     }  

}