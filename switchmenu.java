/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
Write a switch code menu based program to provide the following menu for the users:
    i. get info of Rectangle
    ii. get info of Circle
    iii. get info of Square

    Take a choice for above menu from the user. If user inputs 1 as a choice,
    then he is prompted to enter length and breadth and also provided with another menu.
    a. print area of rectangle
    b. print perimeter of rectangle.
    
    Similarly if user provides input as ii and iii similar menu should be given
*/

import java.util.Scanner;
public class switchmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:\n1. Get info of Rectangle\n2. Get info of Circle\n3. Get info of Square");
        int cs=sc.nextInt();
        switch (cs) {
            case 1: {
                System.out.println("Enter:\n1. Area\n2. Perimeter ");
                int r= sc.nextInt();
                System.out.println("Enter length and breadth: ");
                int l=sc.nextInt();
                int b=sc.nextInt();
                switch (r) {
                    case 1: {
                        System.out.println("Area of rectangle=" + (l * b));
                        break;
                    }
                    case 2: {
                        System.out.println("Perimeter of rectangle=" + (2*(l+b)));
                        break;
                    }
                    default: {
                        System.out.println("Invalid input.");
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter:\n1. Area\n2. Perimeter");
                int c=sc.nextInt();
                System.out.println("Enter radius: ");
                int r=sc.nextInt();
                final double pi=3.14;
                switch (c) {
                    case 1: {
                        System.out.println("Area of circle=" + (pi * r * r));
                        break;
                    }
                    case 2: {
                        System.out.println("Perimeter of circle=" + (2 * pi * r));
                        break;
                        
                    }
                    default: {
                            System.out.println("Invalid input.");
                            break;
                            }
                }
                break;
            }
            case 3: {
                System.out.println("Enter:\n1. Area\n2. Perimeter");
                int s=sc.nextInt();
                System.out.println("Enter length: ");
                int le=sc.nextInt();
                switch (s) {
                    case 1: {
                        System.out.println("Area of square=" + (le * le));
                        break;
                    }
                    case 2: {
                        System.out.println("Perimeter of square=" + (4*le));
                    }
                    default: {
                            System.out.println("Invalid input.");
                            break;
                            }
                }
                break;
            }
        }  
    }
}
