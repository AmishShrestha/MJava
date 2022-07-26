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
    }
}
