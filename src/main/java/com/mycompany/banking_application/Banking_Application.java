/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banking_application;
import java.util.*;
/**
 *
 * @author abhijit
 */
public class Banking_Application {

    public static void main(String[] args) {
      
       
       System.out.println("Press a number 1 if you want open account in Maharashtra bank");
       System.out.println("Press a number 2 if you want open account in BankOfBharat");
       
       
       Scanner ab = new Scanner(System.in);
       
       int option = ab.nextInt();
       
       RBI_Interface bankaccount;
       
       
       if(option==1){
           
        System.out.println("Enter your password and Initial Deposit");
        
        Integer deposit = ab.nextInt();
        String password = ab.nextLine();
        
       double accountNo = Math.abs(Math.random()+Math.pow(10,9));
       
       
       
       bankaccount = new MaharashtraBank(deposit,password);
         
               
       }
       
       
       
       
         
       
        
    }
}
