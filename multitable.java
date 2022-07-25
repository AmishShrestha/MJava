/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
//WAP to print multiplication table.
import java.util.Scanner;
public class multitable {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m;
        System.out.print("Multiplication table of: ");
        m=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(m + "x" + i + "=" + (m*i));
        }
    }
}
