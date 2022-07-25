/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
//WAP to search the number from series.
import java.util.Scanner;
public class search {
    public static void main(String[] args)
    {
        int d[]={1,4,5,6,3,2,8}, S, f=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter search number: ");
        S=sc.nextInt();
        for(int i=0;i<7;i++)
        {
            if(d[i]==S)
            {
                System.out.println("Search successful");
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("Search unsuccessful");
    }
}
