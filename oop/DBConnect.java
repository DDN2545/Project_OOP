
package oop;
import java.sql.*;

import javax.swing.JOptionPane;
 //@author pakin

public class DBConnect {
    private Connection connect; // working with connecting together with database and String
    private Statement st; // to running laguage sql 
    //private String Url="http://localhost/phpmyadmin/";
    private String Url="jdbc:mysql://localhost:3307/myincome";  // jdbg jabd is the diver that run sql
    // to using url. Right click in the opening sever (the yellow file)
    // crtl c at the begining to the name of database
    private String User="root"; // user for database
    private String Password="";


    public ResultSet getResult(String query){
       ResultSet rs;
       //boolean rs;
       System.out.println(query+'2');
       try{ 
           System.out.println(query+'3');
           connect = DriverManager.getConnection(Url, User, Password);        // error this line    so muct problem  
           System.out.println(query+'4');
           st=connect.createStatement();                          // error this line    so muct problem  
           System.out.println(query+'5');
           rs = st.executeQuery(query);                           // error this line    so muct problem  
           System.out.println(query+'6');
           
           
       }catch(SQLException ex){
           System.out.println("2");
           rs=null;
       }
       return rs;
    }

    
    public boolean execute(String query){
        boolean rs;
        try{
            System.out.println("5.2");
            connect = DriverManager.getConnection(Url, User, Password);
            System.out.println("6.2");            
            st=connect.createStatement();    
            System.out.println("7.2");
            System.out.println(query);
            st.execute(query);            
            System.out.println("8.2");
            rs=true;
        }
        catch(Exception ex){
            System.out.println("4");
            rs = false;
        }
        return rs;
    }


    public void close(){
        try{
            connect.close();
        }catch(Exception ex){
            //NOT doing anything
        }
    }
}
