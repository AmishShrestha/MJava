/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Iterationdemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int a = 1;
        while (a <= 50) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
//        while(b=true){
//            if(a!=50){
//                System.out.println(a);
//            }
//            
//            a++;
//        }
    }
}
