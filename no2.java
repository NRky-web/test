/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class no2 {

    public static void main(String[] args) {
        
        System.out.println(is_username_valid("@sony"));
        System.out.println(is_username_valid("Ayu99v"));
        System.out.println(is_password_valid("@p@ssW0rd#"));
        System.out.println(is_password_valid("C0d3YourFuture!#"));
        
    }
    static boolean is_username_valid(String username){
        boolean valid = username.matches("(?=.*[A-Z])[a-zA-Z]+[a-zA-z0-9]{4,9}");
        return valid;
    }
    static boolean is_password_valid(String password){
        boolean valid = password.matches("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*\\W)(?=.*[@]).{8,})");
        return valid;
    }
    
}
