package com.sparkco;

// E:\projects\Java\105\Study-808\PrefixPostFixinABooleanExpression\bin\com\sparkco

// To run: 
// cp (classpackage) requires a fully qualified package
// E:\>java -cp E:\projects\Java\105\Study-808\PrefixPostFixinABooleanExpression\bin com.sparkco.Test
public class Test {
     public static void main(String [] args) {
         int a = 3;

         a = 3;
         System.out.println(a++ == 3);

         a = 3;
         System.out.println(--a == 3);

         a = 3;         
         System.out.println(--a == 2);
         
         a = 3;       
         // first test is true, the rest short-circuits
         System.out.println(a++ == 3 || (--a == 3 && --a == 3));
         System.out.println("the value of a: " + a);

         a = 3;         
         // first test is true, but no short-circuits
         System.out.println(a++ == 3 && --a == 3 && --a == 2);
         System.out.println("the value of a: " + a);
     
     }
}