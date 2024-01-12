/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author pakin
 */
public class IncomeAndExpenses {
    private String Detail;
    private int Type;
    private int Date;
    private double money;
    private double Total;
    
    public IncomeAndExpenses(String dt,int d){
        Detail = dt;
        Date = d;
        Total = Total + money ;
    }
    
    public String getDetail(){
        return Detail;
    }
    public int getDate(){
        return Date;
    }
    public double getMoney(){
        return money;         
    }
    public double getTotal(){
        return Total;
    }
}
