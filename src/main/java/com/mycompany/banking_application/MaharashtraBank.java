/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_application;

/**
 *
 * @author abhijit
 */


public class MaharashtraBank implements RBI_Interface {
    
    private String AccountNo;
    private double RateOfInterest = 7.5;
    private String password;
    private double balance; 
    
    public MaharashtraBank(String accNo,String passWord,double balance){
        this.AccountNo = accNo;
        this.password = password;
        this.balance = balance;
    }

    MaharashtraBank(Integer deposit, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
         
           if(balance-money>0){
            balance-=money;
            return "Money"+money+"has been deducted from your account";
           }else{
               return "Insufficent Balance";
           }
        }else{
            return "Wrong password entered";
        }
    }

    public String CheckBalance(String password) {
        
       if(this.password==password){
           return "Your account balance is "+balance+" ruppes";
       }else{
           return "wrong password";
       }
    }
    
    
    public double CalculateTotalInterest (int time)
    { 
        double SimpleInterest =  (balance*time*RateOfInterest)/100;
        
        return SimpleInterest;  
    }
    
}
