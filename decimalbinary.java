/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class decimalbinary {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int c;
        System.out.println("1. Decimal to Binary \n2. Binary to Decimal");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
                int dec, bin[];
                System.out.print("Decimal: ");
                dec=sc.nextInt();
                bin= new int[8];
                for(int i=0;dec!=0;i++)
                {
                    int rem=dec%2;
                    bin[i]=rem;
                    dec/=2;
                }
                for(int i=7;i>=0;i--)
                {
                    System.out.print(bin[i]);
                }
                break;
            case 2:
                int binr, deci=0;
                System.out.print("Binary: ");
                binr=sc.nextInt();
                for(int i=0;binr!=0;i++)
                {
                    int rem=binr % 10;
                    deci +=rem*Math.pow(2,i);
                    binr/=10;
                }
                System.out.print("Decimal: " + deci);
                break;
            default:
                System.out.println("Invalid Operation.");
        }
    }
}
