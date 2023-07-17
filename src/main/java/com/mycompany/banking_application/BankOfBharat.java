/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_application;

/**
 *
 * @author abhijit
 */
public class BankOfBharat implements RBI_Interface {

    private String AccountNo;
    private double RateOfInterest = 7.5;
    private String password;
    private double balance; 
    private double minimumBalance = 500;
    
    public BankOfBharat (String accNo,String password,double balance){
        this.AccountNo = accNo;
        this.password = password;
        this.balance = balance;
    }
    
    
    public String AddMoney(int money) {
        
         if(money>0){
            balance+=money;
            
            return "money has been added to account";
        }
        else{
            return "Negative money cant be added";
        }
     
    }

   
    public String WithdrawMoney(int money,String password) {
        if(this.password==password){
         
           if(balance-minimumBalance>money){
            balance-=money;
            return "Money "+money+" has been deducted from your account";
           }else{
               return "Insufficent Balance , Minimum balance needed is"+minimumBalance;
           }
        }else{
            return "Wrong password entered";
        }
    }
    

    public String CheckBalance(String password) {
        
       if(this.password==password){
           return "Your account balance is "+balance+" rupees";
       }else{
           return "wrong password";
       }
        
    }
    
      public double CalculateTotalInterest (int time){
          
        double SimpleInterest =  (balance*time*RateOfInterest)/100;
        
        return SimpleInterest;  
      }
    
}
