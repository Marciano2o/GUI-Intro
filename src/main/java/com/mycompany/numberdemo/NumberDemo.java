/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberdemo;
import java.util.Scanner;
/**
 *
 * @author marci
 */
public class NumberDemo {

    public static void main(String[] args) {
      
      //Instaniate the Scanner object.
      Scanner sc = new Scanner(System.in);  
        
      
      //Instaniate the NumberDef object
      NumberDef nd = new NumberDef ();
      
      
        System.out.println("Enter first interger value: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second interger value: ");
        int num2 = sc.nextInt();
        
        nd.displayNumberSquared(num1, num2);
        
        nd.displayNumberPlusFive(num1, num2);
        
        nd.displayTwiceTheNumber(num1, num2);
        
        
    }
}
