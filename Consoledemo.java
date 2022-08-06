/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

//Yo program chaldeina netbeans ma, console ma chalxa, kasari chalaune audeina :skull:
public class Consoledemo {
    public static void main(String[] args) {
        System.out.println("Enter username: ");
        String username= System.console().readLine();
        System.out.println("Enter password: ");
        char[] c=System.console().readPassword();
        System.out.println("username" + username + "Password: " + String.valueOf(c));
    }
    
}
