/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class tryandcatch {
    public static void main(String[] args){
//        int a=1, b=0;
//        try{
//            System.out.println(a/b);
//            System.out.println("Hello");
//        }
//        finally{
//            System.out.println("World");
//        }
//        System.out.println("Good day");
//        Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//        try{
//            if(age<18)
//                throw new ArithmeticException("Voting Error");
//            else
//                System.out.println("Welcome to Vote");
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
        String s = "My name is Amish. My email is something@something.com";
        int c_count[] = new int[65535];
        char[] cfroms = s.toCharArray();
        for (int i = 0; i < cfroms.length; i++) {
            c_count[(int) cfroms[i]]++;
        }
        for (int i = 0; i < c_count.length; i++) {
            if (c_count[i] != 0) {
                System.out.println((char) i + "->" + c_count[i]);
            }
        }

        

    }
        
}
