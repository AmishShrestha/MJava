/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

/*break is used to exit from a loop or switch case

continue is used to move on to next iteration by passing all the remaining statements in the current iteration

return is used to return to the caller of a method.
Two functions of return:
    i exit from a method and return back to caller.
    while returning take some value of return type mentioned in the method.

*/
import java.util.Scanner;
public class breakcontreturn {
    public static void main(String[] args) {
//        for(int i=0; i<=10; i++){
////        for(int i=1; i<=10; i++){ //i 1 rakhyo bhane output 4 samma janxa
//            if(i%5==0) {
//                break;
//            }
//            System.out.println(i);
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime=false;
                System.out.println(n + " is not prime");
                break;
            }
        }
        if(isPrime){
            System.out.println(n + " is prime");
        }
    }
}
