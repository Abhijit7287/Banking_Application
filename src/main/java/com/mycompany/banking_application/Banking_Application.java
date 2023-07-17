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
       
       int option = ab.nextInt();ab.nextLine();
       
       System.out.println("Enter your password and Initial Deposit");
        
       String password = ab.nextLine();
                          
       int deposit = ab.nextInt();
       
       RBI_Interface bankaccount;
   
       double accountNo =Math.abs(Math.random()+Math.pow(10,9));
       
       String s =String.valueOf(accountNo);
       
       
       if(option==1){
           
       bankaccount = new MaharashtraBank(s,password,deposit);
              
       }else{
            bankaccount = new BankOfBharat(s,password,deposit);
       }
       
       
      String a =  bankaccount.WithdrawMoney(50000, password);
      
      System.out.println(a);
       
      String b = bankaccount.AddMoney(50000);
      
       System.out.println(b);
       
       String c =   bankaccount.CheckBalance(password);
     
      System.out.println(c);
       
      double d =  bankaccount.CalculateTotalInterest(3);
      
       System.out.println(d);
    }
}
