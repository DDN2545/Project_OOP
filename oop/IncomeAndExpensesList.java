/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.ArrayList;

/**
 *
 * @author pakin
 */
public class IncomeAndExpensesList {
    private ArrayList<IncomeAndExpenses> Il;
    private int inListQ;

    public IncomeAndExpensesList() {
        Il = new ArrayList<IncomeAndExpenses>();
        inListQ = 0;
    }
    public void add(IncomeAndExpenses obj){
        Il.add(obj);
        inListQ++;
    }
    public void removeByName(String n){
        int check = 0;
        for(IncomeAndExpenses a:Il){
            if(a.getDetail().equals(n)){
                Il.remove(check);
                inListQ--;
                return;
            }
            check++;
        }
    }
    public void removeByIndex(int i){
        Il.remove(i);
        inListQ--;
    }
    public IncomeAndExpenses getItem(int i){
        return Il.get(i);
    }
    public int getInListQ(){
        return inListQ;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

