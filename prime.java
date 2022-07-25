/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num, flag=1;
        System.out.println("Enter no.: ");
        num=sc.nextInt();
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                System.out.print(num + "is not prime number.");
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println(num + " is prime number.");
    }
}
