/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class sorting {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n[], dem;
        n=new int[10];
        for(int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();  
        }
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10-i;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(n[j]>n[j+1])
                {
                    dem=n[j];
                    n[j]=n[j+1];
                    n[j+1]=dem;
                }
            }
        }
        System.out.println("Sorted data: ");
        for(int i=0;i<10;i++)
            System.out.print(n[i] + "\t");
    }
}
