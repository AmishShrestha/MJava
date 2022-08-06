/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class nested_while {
    public static void main(String[] args) {
//        int a=10, b=20;
//        while(a<=20)
//        {
//            while(b<=2000){
//                b*=a++;
//            }
//            System.out.println(b);
//        }
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=5){

                if(i>=j)
                    System.out.print(j+"\t");
                    j++;
            }
            i++;
            System.out.println("");
            
        }
        System.out.println("Next Pattern");
        
        i=1;
        while(i<=5){
            int j=1;
            while(j<=5){

                if(i+j<=6)
                    System.out.print(j+"\t");
                    j++;
            }
            i++;
            System.out.println("");
        }
        System.out.println("Next Pattern");
        
        i=1;
        while(i<=5){
            int j=1;
            int k=5;
            while(j<=5){

                if(i+j<=6)
                    System.out.print(k+"\t");
                else
                    System.out.print("");
                    j++;
                    k--;
            }
            i++;
            System.out.println("");
        }
        System.out.println("Next Pattern");
        
        i=1;
        while(i<=5){
            int j=1;
            while(i>=j){
                if(j==i)
                    System.out.print(i+"\t");
                else
                    System.out.print(1+"\t");
                   
                j++;    
            }
            i++;
            System.out.println("");
        }
        System.out.println("Next Pattern");
        
        i=1;
        while(i<=5){
            int j=1;
            while(j<=5){
                if(i+j<=6)
                    System.out.print(" ");
                else
                    System.out.print(j);
                   
                j++;
            }
            i++;
            System.out.println("");
        }
        System.out.println("Next Pattern");
    }
}

/*
    1
   121
  12321
 1234321
123454321
*/