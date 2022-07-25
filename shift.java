/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class shift {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num, l, r;
        System.out.println("Enter number to shift: ");
        num=sc.nextInt();
        l=num<<2;
        r=num>>2;
        System.out.println("Left shift = " + l + "\nRight shift = " + r);
    }
}
