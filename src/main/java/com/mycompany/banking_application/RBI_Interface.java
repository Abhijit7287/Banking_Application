/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.banking_application;

/**
 *
 * @author abhijit
 */
public interface RBI_Interface {
    
    public String AddMoney(int money);
    
    public String WithdrawMoney(int money,String password);
    
    public String CheckBalance(String password);
    
    public double CalculateTotalInterest (int time);
        
}
