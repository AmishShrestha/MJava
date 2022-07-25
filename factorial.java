/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        double f=0;
        System.out.println("Enter number of factorial: ");
        n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int mup = 1;
            int m=i;
            while(m>=1)
            {
                mup*=m;
                m--;
            }
            f+=i/mup;
        }
        System.out.println("Sum=" + f);
    }
}
