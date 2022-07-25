/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

/*
syntax switch(expression){
case var:
statements
[break];

case var:
statements
[break];

case var:
statements
[break];

[default:]
{
    break;
}
}
*/
import java.util.Scanner;
public class switchcasedemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a choice: 1. Print odd num from 1 to n\n 2. print even num from 1 to n\n n ");
        int a = sc.nextInt();
        System.out.println("Enter n: ");
        int b = sc.nextInt();
        switch (a) {
        case 1: {
            for (int i=1; i<b; i++) {
                //if(i%2==1){
                if(i%2!=0){
                    System.out.println(i);
                }
            }
            break;
        }
        case 2: {
            for (int i=1; i<b; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
            break;
        }
        case 3: {
            System.out.println("Invalid aruguement");
            break;
        }
    
        }
    }
}


