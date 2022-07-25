/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num, rev=0;
        System.out.println("Enter num:");
        num=sc.nextInt();
        int a=num;
        for(;num!=0;){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(a==rev)
            System.out.println("palindrom");
        else
            System.out.println("not palindrom");

    }
}
