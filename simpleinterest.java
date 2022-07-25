/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float Si, p, t, r;
        System.out.println("Enter p, t, r: ");
        p= sc.nextFloat();
        t= sc.nextFloat();
        r= sc.nextFloat();
        Si= (p*t*r)/100;
        System.out.println("Simple Interest = " + Si);
    }
}
