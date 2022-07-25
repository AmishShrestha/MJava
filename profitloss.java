/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
//WAP to find CP and SP. Take input from user.
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int CP, SP;
        System.out.println("Enter CP & SP: ");
        CP=sc.nextInt();
        SP=sc.nextInt();
        if(CP>SP)
            System.out.println("Loss=" + (CP-SP));
        else
            System.out.println("Profit=" + (SP-CP));
    }
}
