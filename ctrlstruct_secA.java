/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

//used to cause the flow of eecution to advance and branch based on changes to state of the program.

/*selection statements:
allows to choose different paths of execultion based on the outcome of an expression or the state of the variable
*/

/*
iteration statements:
enables program execution to repeat one or more statements.
*/

/*Jump Statements:
allows to execute the program in non linear fashhion.
*/

import java.util.Scanner;
public class ctrlstruct_secA {
    public static void main(String[] args) {
        //syntax if(conditional expression or boolean val)(...statements...)
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age <= 14){
            System.out.println("You are still a child.");
        }
//        if(age>14){
//            System.out.println("You are grown up.");
//        }
//        else{
//            System.out.println("You are grown up.");
//        }
        else if(age>19 & age<=50){
            System.out.println("You are adult.");
        }
        else{
            System.out.println("You're old.");
        }
        System.out.println("Have a good day!!");
    }
}
