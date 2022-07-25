/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class concentriccircle {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int r1, r2;
        double pi=3.14, A;
        System.out.println("Enter r1 & r2: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        A = (pi * r1 * r1) - (pi * r2 * r2);
        System.out.println("Area = " + A);
    }
}
