/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

/*
syntax:
for(initialization; condition; update)
{
    statements...
}

//while loop
int i=1//initialization
while(i<=10)//condition
{
    sop(i);
    i++;//update

//for loop
for(int i=1; i<=10; i++)
{
    sop(i);
}

*/

//Q. 1^2+2^2+3^3+.........+n^2
import java.util.Scanner;
public class forloopdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            sum+=Math.pow(i,2);
        }
        System.out.println("Sum= " + sum);
    }
}
