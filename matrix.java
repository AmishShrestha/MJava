/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class matrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a, m1[][], m2[][], t[][], b;
        System.out.println("Enter row & column: ");
        a=sc.nextInt();
        b=sc.nextInt();
        m1=new int[a][b];
        m2=new int[a][b];
        t=new int[b][a];
        System.out.println("Enter elements of matrix1: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
                m1[i][j]=sc.nextInt();
            
        }
        System.out.println("Enter elements of matrix2: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of m1 and m2: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(m1[i][j] + m2[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                t[j][i]=m1[i][j];
            }
        }
        System.out.println("Transpose of m1");
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
